package com.prac;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppointmentDAO {

    EntityManager em;

    public AppointmentDAO() {
        em = Persistence.createEntityManagerFactory("postgres").createEntityManager();
    }

    public void save(Appointment a) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(a);
        et.commit();
    }

    public Appointment find(int id) {
        return em.find(Appointment.class, id);
    }

    public void update(Appointment a) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(a);
        et.commit();
    }
}
