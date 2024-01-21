package entities;

import entitiesEnum.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static application.Util.*;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    ArrayList<OrderItem> items = new ArrayList<>();
    Client client;

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + dtf2.format(moment) + "\n");
        sb.append("Order Status: " + getStatus() + "\n");
        sb.append(client.toString() + "\n");
        sb.append("Order Items: \n");
        for (OrderItem printItems : items) {
            sb.append(printItems.toString() + "\n");
        }
        sb.append("Total Price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double somatorio = 0;
        for (OrderItem itemPrint : items) {
            somatorio += itemPrint.subTotal();
        }
        return somatorio;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
