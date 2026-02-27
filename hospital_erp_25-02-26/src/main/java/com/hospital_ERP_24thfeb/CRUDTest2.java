package com.hospital_ERP_24thfeb;

import javax.persistence.*;

public class CRUDTest2 {

    public static void run(EntityManager em) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Doctor d1 = new Doctor();
        d1.setDoctorName("Dr. Sharma");
        d1.setSpecialization("Cardiology");

        Doctor d2 = new Doctor();
        d2.setDoctorName("Dr. Mehta");
        d2.setSpecialization("Neurology");

        Department dept = new Department();
        dept.setDeptName("Medicine");

        dept.getDoctors().add(d1);
        dept.getDoctors().add(d2);

        em.persist(dept);

        tx.commit();

        System.out.println("Department and Doctors inserted");
    }
}