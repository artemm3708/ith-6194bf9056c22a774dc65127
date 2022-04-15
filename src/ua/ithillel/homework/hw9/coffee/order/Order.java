package ua.ithillel.homework.hw9.coffee.order;

public class Order {

    public static int current = 1;
    private int orderNumber;
    private String name;

    public Order(int orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }
}
