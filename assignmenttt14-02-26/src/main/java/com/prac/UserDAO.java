package com.prac;

import javax.persistence.*;

public class UserDAO {

    EntityManager em = Persistence
            .createEntityManagerFactory("postgres")
            .createEntityManager();

    public void save(User user) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(user);
        et.commit();
    }

    public User find(int id) {
        return em.find(User.class, id);
    }

    public void delete(User user) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.remove(user);
        et.commit();
    }
}