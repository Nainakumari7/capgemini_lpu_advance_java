package com.hospital_ERP_24thfeb;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDTest3 {

    public static void run(EntityManager em) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Appointment a1 = new Appointment();
        a1.setAppointmentDate("2026-02-28");
        a1.setReason("Checkup");

        Appointment a2 = new Appointment();
        a2.setAppointmentDate("2026-03-01");
        a2.setReason("Follow-up");

        Doctor doctor = new Doctor();
        doctor.setDoctorName("Dr. Singh");
        doctor.setSpecialization("Orthopedic");

        doctor.getAppointments().add(a1);
        doctor.getAppointments().add(a2);

        em.persist(doctor);

        tx.commit();

        System.out.println("Doctor and Appointments inserted");
    }
}