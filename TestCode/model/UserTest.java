package com.mhutshow.daktarlagbe.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
                                                                                                                                            User newUser=new User("Mahedi Hasan", "Mymensingh","01303312747", "mahedi.hasan@g.bracu.ac.bd", "user");

    @Test
    public void getTypeTest() {
        String actual=newUser.getType();
        assertEquals("user", actual);
    }

    @Test
    public void getNameTest() {
        String actual=newUser.getName();
        assertEquals("Mahe Hasan", actual);
    }

    @Test
    public void getAdresseTest() {
        String actual=newUser.getAdresse();
        assertEquals("Mymensingh", actual);
    }

    @Test
    public void getTelTest() {
        String actual=newUser.getTel();
        assertEquals("01303312747", actual);
    }

    @Test
    public void getEmailTest() {
        String actual=newUser.getEmail();
        assertEquals("mahedi.hasan@g.bracu.ac.bd", actual);
    }
}