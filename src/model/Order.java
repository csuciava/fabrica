package model;

import java.time.LocalDateTime;

public class Order {
    private int Id;
    private Customer customer;
    private LocalDateTime orderDate;
    private Car orderedCar;

    public Order(int Id, Customer customer, Car orderedCar, LocalDateTime orderDate){
        this.Id  = Id;
        this.customer = customer;
        this.orderedCar = orderedCar;
        this.orderDate = orderDate;
    }
}
