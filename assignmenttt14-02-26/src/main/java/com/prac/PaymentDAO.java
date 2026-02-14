package com.prac;

import javax.persistence.*;

public class PaymentDAO {

    EntityManager em = Persistence
            .createEntityManagerFactory("postgres")
            .createEntityManager();

    public void save(Payment payment) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(payment);
        et.commit();
    }
}