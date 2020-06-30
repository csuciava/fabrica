package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdersListTest {
    private Order order;
    private Customer customer;
    private Car car;

    @BeforeEach
    void setUp() {
        customer = new Customer("George");

    }

    @Test
    @DisplayName("You can add one order")
    void addOrder() {

    }
}