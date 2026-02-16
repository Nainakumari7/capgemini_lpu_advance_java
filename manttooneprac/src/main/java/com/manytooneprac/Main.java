package com.manytooneprac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Department dept = new Department();
        dept.setName("HR");
        dept.setSalary(0);
        dept.setDesignation("Management");

        Employee e1 = new Employee();
        e1.setEmpName("Miller");
        e1.setEmpSalary(2000);
        e1.setEmpDesignation("ASE");
        e1.setDept(dept);

        Employee e2 = new Employee();
        e2.setEmpName("Virat");
        e2.setEmpSalary(3000);
        e2.setEmpDesignation("Analyst");
        e2.setDept(dept);

        et.begin();
        em.persist(dept);
        em.persist(e1);
        em.persist(e2);
        et.commit();

        em.close();
        emf.close();
    }
}
