package com.prac;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DoctorDAO {

    EntityManager em;

    public DoctorDAO() {
        em = Persistence.createEntityManagerFactory("postgres").createEntityManager();
    }

    public void save(Doctor d) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(d);
        et.commit();
    }

    public Doctor find(int id) {
        return em.find(Doctor.class, id);
    }
}
