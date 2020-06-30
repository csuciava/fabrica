package model;

import java.util.Collections;
import java.util.LinkedList;

public class OrdersList {
    private LinkedList<Order> orderList = new LinkedList<Order>();

    public LinkedList<Order> getOrderList() {
        return (LinkedList) Collections.unmodifiableList(orderList);
    }

    public boolean addOrder(Order order){
        try {
            orderList.add(order);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

}
