package controller;

import java.util.ArrayList;
import java.util.List;
import model.Order;
import model.OrderStatus;

public class OrderController {
    private List<Order> orders;

    public OrderController() {
        this.orders = new ArrayList<>();
    }

    public boolean addOrder(Order order) {
        boolean isAdded = orders.add(order);
        if (isAdded) {
            System.out.println("Order: " + order.getOrderID() + " has been successfully added.");
        }
        return isAdded;
    }

    public boolean deleteOrder(Order order) {
        boolean isRemoved = orders.remove(order);
        if (isRemoved) {
            System.out.println("Order: " + order.getOrderID() + " has been successfully removed.");
            order.setStatus(OrderStatus.Removed);
        }
        return isRemoved;
    }

    // Additional methods you might want to add:
    public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderID() == orderId) {
                return order;
            }
        }
        return null; // Or throw an exception if order is not found
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders); // Return a copy to avoid exposing internal list
    }
}
