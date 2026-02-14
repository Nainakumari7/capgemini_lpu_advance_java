package com.prac;

import javax.persistence.*;

public class OrderDAO {

    EntityManager em = Persistence
            .createEntityManagerFactory("postgres")
            .createEntityManager();

    public void update(PurchaseOrder order) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(order);
        et.commit();
    }
}