package com.prac;

import javax.persistence.*;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;

    public int getId() { return id; }
    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}