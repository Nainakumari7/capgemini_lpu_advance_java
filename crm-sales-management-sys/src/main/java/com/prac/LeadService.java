package com.prac;

import javax.persistence.*;

public class LeadService {

    private EntityManager em;

    public LeadService(EntityManager em) {
        this.em = em;
    }

    public void addLead(Lead lead) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(lead);
        et.commit();
    }
}