package entities;

import entitiesenum.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private Integer id;
    private LocalDateTime moment;
    private OrderStatus order;

    public Order(Integer id, LocalDateTime moment, OrderStatus order) {
        this.id = id;
        this.moment = moment;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrder() {
        return order;
    }

    public void setOrder(OrderStatus order) {
        this.order = order;
    }


    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("'Date: 'dd/MM/yyyy '& Hour: 'HH:mm");
        return String.format("ID: %s%n%s%nOrderStatus: %s%n", id, dtf.format(moment), order);
    }
}
