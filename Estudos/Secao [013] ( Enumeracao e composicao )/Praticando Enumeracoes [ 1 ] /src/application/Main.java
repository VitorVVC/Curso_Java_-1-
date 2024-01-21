package application;

import entities.Order;
import entitiesenum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Order order = new Order(1090, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);


        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
    }
}