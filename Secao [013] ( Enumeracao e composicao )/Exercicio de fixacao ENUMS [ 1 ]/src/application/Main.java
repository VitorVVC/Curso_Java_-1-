package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;

import java.util.Locale;
import java.util.Scanner;

import static application.Util.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=================");
        Client client = dadosCliente();
        // Name: Alex Green
        // Email: alex@gmail.com
        // Date: 15/03/1985
        System.out.println("=================");
        Order order = dadosOrder(client);
        // Status: Processing
        System.out.println("=================");
        OrderItem orderItem = dadosOrderItem(order);
        // How Many Items: 2
        // Product Name [1]: TV
        // Product Price [1]: 1000.00
        // Quantity [1]: 1
        // Product Name [2]: Mouse
        // Product Price[2]: 40.00
        // Quantity [2]: 2
        System.out.println("=================");


    }
}