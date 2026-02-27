package com.hospital_ERP_24thfeb;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CRUDTest4 {

    public static void run(EntityManager em) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Prescription prescription = new Prescription();
        prescription.setMedicine("Paracetamol");
        prescription.setDosage("2 times a day");

        Appointment appointment = new Appointment();
        appointment.setAppointmentDate("2026-03-02");
        appointment.setReason("Fever");
        appointment.setPrescription(prescription);

        em.persist(appointment);

        tx.commit();

        System.out.println("Appointment and Prescription inserted");
    }
}