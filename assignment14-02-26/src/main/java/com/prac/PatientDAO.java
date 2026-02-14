package com.prac;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PatientDAO {

    EntityManager em;

    public PatientDAO() {
        em = Persistence.createEntityManagerFactory("postgres").createEntityManager();
    }

    public void save(Patient p) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(p);
        et.commit();
    }

    public Patient find(int id) {
        return em.find(Patient.class, id);
    }

    public void delete(Patient p) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(p);
        et.commit();
    }
}
