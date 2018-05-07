package com.matheus.phonebook;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhonebookTest {

    List<Contact> contactListTest;
    Phonebook phonebookTest;
    Contact contactTest;

    @Before
    public void before() {
        contactListTest = new ArrayList<Contact>();
        phonebookTest = new Phonebook();
        contactTest = new Contact("Matheus", 5444, "matheus.matheus@matheus.mat");
    }

    @Test
    public void addContactTest() {
        assertTrue(phonebookTest.addContact(contactTest));
    }

    @Test
    public void removeContactByIdTest() {
        Phonebook phonebookNotModified = new Phonebook();
        phonebookNotModified.addContact(contactTest);

        phonebookTest.addContact(contactTest);
        phonebookTest.addContact(contactTest);
        phonebookTest.removeContactById(contactTest.getId());

        assertSame(phonebookTest.listContacts().size(), phonebookNotModified.listContacts().size());
    }

    @Test
    public void findContactByIdTest() {
        phonebookTest.addContact(contactTest);
        int idContact = contactTest.getId();
        Contact idContactRemoved = phonebookTest.findContactById(contactTest.getId());
        assertEquals(idContact, idContactRemoved.getId());
    }

    @Test
    public void findContactByNameTest() {
        phonebookTest.addContact(contactTest);
        List<Contact> contactsFounds = phonebookTest.findContactByName(contactTest.getName());
        assertEquals(contactTest.getName(), contactsFounds.get(0).getName());
    }
}