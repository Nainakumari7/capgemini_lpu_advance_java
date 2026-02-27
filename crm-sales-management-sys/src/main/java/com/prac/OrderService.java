package com.prac;

import javax.persistence.*;

public class OrderService {

    private EntityManager em;

    public OrderService(EntityManager em) {
        this.em = em;
    }

    public void placeOrder(Order order) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(order);
        et.commit();
    }
}