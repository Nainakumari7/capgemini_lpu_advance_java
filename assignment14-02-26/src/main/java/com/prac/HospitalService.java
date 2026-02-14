package com.prac;

import java.util.Arrays;

public class HospitalService {

    PatientDAO patientDAO = new PatientDAO();
    DoctorDAO doctorDAO = new DoctorDAO();
    AppointmentDAO appointmentDAO = new AppointmentDAO();

    public void registerPatient(Patient p, MedicalRecord m) {
        p.setMedicalRecord(m);
        patientDAO.save(p);
    }

    public void createDoctorWithAppointment(Doctor d, Appointment a) {
        d.setAppointments(Arrays.asList(a));
        doctorDAO.save(d);
        appointmentDAO.save(a);
    }

    public void assignPatient(Appointment a, Patient p) {
        a.setPatient(p);
        appointmentDAO.update(a);
    }
}
