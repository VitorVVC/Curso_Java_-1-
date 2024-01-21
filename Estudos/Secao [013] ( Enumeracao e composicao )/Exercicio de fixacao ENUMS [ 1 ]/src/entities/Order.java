package entities;

import entititesEnum.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    Client client;
    ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public double total() {
        double valorTotal = 0;
        for (OrderItem orderItemPrints : orderItems) {
            valorTotal += orderItemPrints.subTotal();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(dtf.format(this.moment) + "\n");
        sb.append("Order status: ");
        sb.append(this.status + "\n");
        sb.append("Client: ");
        sb.append(client.toString() + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem items : orderItems) {
            sb.append(items.toString() + "\n");
        }
        sb.append("Total price: ");
        sb.append(String.format("$ %.2f", total()));


        return sb.toString();
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

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}
