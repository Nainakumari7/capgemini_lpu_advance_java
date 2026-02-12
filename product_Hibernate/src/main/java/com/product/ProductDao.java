package com.product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ProductDao {

    private EntityManagerFactory emf;

    public ProductDao(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void insertProduct(product product) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(product);

        em.getTransaction().commit();
        em.close();
    }

    public product findById(int id) {
        EntityManager em = emf.createEntityManager();
        product p = em.find(product.class, id);
        em.close();
        return p;
    }
}
