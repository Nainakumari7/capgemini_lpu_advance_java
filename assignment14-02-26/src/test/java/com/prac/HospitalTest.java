package com.prac;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class HospitalTest {

    @Test
    public void testHospitalFlow() {

        HospitalService service = new HospitalService();

        MedicalRecord mr = new MedicalRecord();
        mr.setBloodGroup("O+");
        mr.setHistory("Normal");

        Patient p = new Patient();
        p.setName("Ravi");
        p.setAge(22);
        p.setContact("99999");

        service.registerPatient(p, mr);

        Appointment a = new Appointment();
        a.setDate("12-02-2026");
        a.setFee(500);

        Doctor d = new Doctor();
        d.setName("Dr Sharma");
        d.setSpecialization("Ortho");

        service.createDoctorWithAppointment(d, a);
        service.assignPatient(a, p);

        assertNotNull(p.getMedicalRecord());
    }
}
