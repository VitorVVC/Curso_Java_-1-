package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entititesEnum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Util {
    public static Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static Client dadosCliente() {
        System.out.println("Enter client data: ");

        System.out.print("Name: "); // Alex Green
        String name = sc.nextLine();
        System.out.print("Email: "); // alex@gmail.com
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): "); // 15/03/1985
        LocalDate ld = LocalDate.parse(sc.nextLine(), dtf2);

        Client client = new Client(name, email, ld);
        return client;
    }

    public static Order dadosOrder(Client client) {
        System.out.println("Enter order data: ");
        System.out.print("Status: "); // Processing
        OrderStatus os = OrderStatus.valueOf(sc.nextLine().toUpperCase());
        Order order = new Order(LocalDateTime.now(), os, client);
        return order;
    }
    public static OrderItem dadosOrderItem(Order order){
        System.out.print("How many items to this order? "); // 2
        int quantidade = sc.nextInt();

        OrderItem orderItem = null;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.print("Product Name: "); // 1: TV && 2: Mouse
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product Price: "); // 1: 1000.00 && 2: 40.00
            double productPrice = sc.nextDouble();
            sc.nextLine();
            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: "); // 1: 1 && 2: 2
            int quantity = sc.nextInt();
            orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order.toString());

        return orderItem;
    }
}
