package com.hospital_ERP_24thfeb;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDTest5 {

    public static void run(EntityManager em) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Doctor d1 = new Doctor();
        d1.setDoctorName("Dr. Kumar");
        d1.setSpecialization("General");

        Doctor d2 = new Doctor();
        d2.setDoctorName("Dr. Verma");
        d2.setSpecialization("ENT");

        Patient p1 = new Patient();
        p1.setName("Amit");
        p1.setPhone("9999999999");

        Patient p2 = new Patient();
        p2.setName("Neha");
        p2.setPhone("8888888888");

        d1.getPatients().add(p1);
        d1.getPatients().add(p2);

        d2.getPatients().add(p1);

        em.persist(d1);
        em.persist(d2);

        tx.commit();

        System.out.println("Doctor and Patient many-to-many inserted");
    }
}