package com.prac.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        AadharCard ac = new AadharCard();
        ac.setAadharNo(1111);
        ac.setAddress("Delhi");

        HostelRoom hr = new HostelRoom();
        hr.setRoomNo(101);
        hr.setBlockName("A Block");

        Student s = new Student();
        s.setId(1);
        s.setName("Rahul");
        s.setAadharCard(ac);
        s.setHostelRoom(hr);

        et.begin();
        em.persist(ac);
        em.persist(hr);
        em.persist(s);
        et.commit();

        et.begin();
        Student st = em.find(Student.class, 1);
        em.remove(st);
        et.commit();

        System.out.println(em.find(AadharCard.class, 1111));
        System.out.println(em.find(HostelRoom.class, 101));

        em.close();
        emf.close();
    }
}
