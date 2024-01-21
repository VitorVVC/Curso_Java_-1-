package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Util {
    static Scanner sc = new Scanner(System.in);
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy MM:mm:ss");

    public static void dados() {

        System.out.println("Enter Client Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), dtf);

        Client client = new Client(name, email, date);

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());

        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.print("How many items to this order? ");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product produto = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, produto);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);
    }

    public static void teste() {


        String name = "Alex Green";
        String email = "alex@gmail.com";
        LocalDate date = LocalDate.of(1985, 3, 15);

        Client client = new Client(name, email, date);

        OrderStatus status = OrderStatus.PROCESSING;

        Order order = new Order(LocalDateTime.now(), status, client);

        Product productUm = new Product("TV", 1000.00);
        Product productDois = new Product("Mouse", 40.00);

        int quantity = 1;
        int quantityDois = 2;


        OrderItem orderItem = new OrderItem(quantity, 1000.00, productUm);
        OrderItem orderItemDois = new OrderItem(quantityDois, 40.00, productDois);
        order.addItem(orderItem);
        order.addItem(orderItemDois);

        System.out.println();
        System.out.println(order);
    }

}
