package com.prac;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double paidAmount;

    @ManyToOne
    private PurchaseOrder order;

    public int getId() { return id; }
    public double getPaidAmount() { return paidAmount; }
    public PurchaseOrder getOrder() { return order; }

    public void setPaidAmount(double paidAmount) { this.paidAmount = paidAmount; }
    public void setOrder(PurchaseOrder order) { this.order = order; }
}
