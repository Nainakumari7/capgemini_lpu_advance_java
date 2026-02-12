package com.product_hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.product.ProductDao;
import com.product.product;

public class ProductDaoTest {

    static EntityManagerFactory emf;
    EntityManager em;

    @BeforeAll
    public static void initEmf() {
        emf = Persistence.createEntityManagerFactory("postgres");
    }

    @Test
    public void insertProductTest() {
        ProductDao dao = new ProductDao(emf);

        product product = new product();
        product.setId(3);
        product.setName("Pencil");
        product.setPrice(5);

        dao.insertProduct(product);

        assertNotNull(product);
    }
    
    

    @Test
    public void findByIdTest() {
        ProductDao dao = new ProductDao(emf);

        product p = dao.findById(3);
        assertNotNull(p);
    }
    
    @AfterEach
    public void destroyEm() {
    	em.close();
    }
    
    @AfterAll
    public static void destroyEmf() {
    	emf.close();
    }
}
