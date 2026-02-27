package com.prac;

import javax.persistence.*;

public class ProductService {

    private EntityManager em;

    public ProductService(EntityManager em) {
        this.em = em;
    }

    public void addProduct(Product product) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(product);
        et.commit();
    }

    public Product getProduct(int id) {
        return em.find(Product.class, id);
    }
}