package com.hospital_ERP_24thfeb;

import javax.persistence.*;

public class CRUDTest1 {

    public static void run(EntityManager em) {

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        MedicalRecord record = new MedicalRecord();
        record.setDiagnosis("Fever");
        record.setNotes("Bed rest");

        Patient patient = new Patient();
        patient.setName("Bob");
        patient.setPhone("9876543210");
        patient.setMedicalRecord(record);

        em.persist(patient);

        tx.commit();

        System.out.println("Patient and MedicalRecord inserted");
    }
}