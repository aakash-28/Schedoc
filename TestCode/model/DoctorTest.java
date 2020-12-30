package com.mhutshow.daktarlagbe.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoctorTest {
    String name="Dr.Utshow";
    String address= "Address";
    String tel= "01622022030";
    String email= "doctor@email.com";
    String speciality="Dentist";
    Doctor doc=new Doctor();

    @Test
    public void NameTest() {
      doc.setName(name);
      assertEquals(doc.getName(), name);
    }

    @Test
    public void addressTest() {
        doc.setAdresse(address);
        assertEquals(doc.getAdresse(), address);
    }

    @Test
    public void telTest() {
        doc.setTel(tel);
        assertEquals(doc.getTel(), tel);
    }

    @Test
    public void emailTest() {
        doc.setEmail(email);
        assertEquals(doc.getEmail(), email);
    }

    @Test
    public void specialityTest() {
        doc.setSpecialite(speciality);
        assertEquals(doc.getSpecialite(), speciality);
    }
}