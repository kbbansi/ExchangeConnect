package com.tlc.t11.Models;

import javax.persistence.*;

@Entity
@Table
public class OrderModel {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    private Long id;
    private String product;
    private int quantity;
    private double price;
    private String side;

    public OrderModel(Long id, String product, int quantity, double price, String side) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.side = side;
    }

    public OrderModel() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", side='" + side + '\'' +
                '}';
    }
}
