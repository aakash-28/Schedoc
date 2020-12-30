package com.mhutshow.daktarlagbe.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {
    String name="Mahedi";
    String address= "Dhaka";
    String tel= "01622322030";
    String email= "patient@email.com";
    String appointmentDate="03 May 2021";
    String condition= "fever";
    Doctor doc=new Doctor();

    Patient patient=new Patient();

    @Test
    public void nameTest() {
        patient.setName(name);
        assertEquals(patient.getName(), "Mahedi");
    }

    @Test
    public void addressTest() {
        patient.setAdresse(address);
        assertEquals(patient.getAdresse(), "Dhaka");
    }

    @Test
    public void telTest() {
        patient.setTel(tel);
        assertEquals(patient.getTel(), "01622322030");
    }

    @Test
    public void emailTest() {
        patient.setEmail(email);
        assertEquals(patient.getEmail(), "patnt@email.com");
    }

    @Test
    public void appointmentTest() {
        patient.setDateNaissance(appointmentDate);
        assertEquals(patient.getDateNaissance(), "03 May 2021");
    }

    @Test
    public void conditionTest() {
            patient.setSituationFamiliale(condition);
            assertEquals(patient.getSituationFamiliale(),"fever");
    }
}