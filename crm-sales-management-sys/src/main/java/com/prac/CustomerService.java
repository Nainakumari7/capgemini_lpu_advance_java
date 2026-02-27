package com.prac;

import javax.persistence.*;

public class CustomerService {

    private EntityManager em;

    public CustomerService(EntityManager em) {
        this.em = em;
    }

    public void addCustomer(Customer customer) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(customer);
        et.commit();
    }

    public Customer getCustomer(int id) {
        return em.find(Customer.class, id);
    }
}