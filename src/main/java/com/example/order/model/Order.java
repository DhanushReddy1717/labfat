package com.example.order.model;

public class Order {
    private int id;
    private String product;
    private int quantity;

    public Order(int id, String product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
}
