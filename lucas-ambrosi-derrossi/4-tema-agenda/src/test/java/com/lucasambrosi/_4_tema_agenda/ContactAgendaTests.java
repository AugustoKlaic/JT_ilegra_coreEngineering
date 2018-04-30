package com.lucasambrosi._4_tema_agenda;

import com.lucasambrosi._4_tema_agenda.pojo.Person;
import com.lucasambrosi._4_tema_agenda.agenda.ContactAgenda;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactAgendaTests {

    private ContactAgenda contactAgenda;
    private Person person, person2, person3;

    @Before
    public void before(){
        contactAgenda = new ContactAgenda();
        person = new Person(1, "Teste1", "teste1@gmail.com", "91234-5678");
        person2 = new Person(2, "Teste2", "teste2@gmail.com", "98765-4321");
        person3 = new Person(3, "Teste3", "teste3@gmail.com", "98471-7352");

    }

    @Test
    public void addContactTest(){
        assertEquals(true, contactAgenda.addContact(person));
        assertEquals("Teste1", contactAgenda.listPeople().get(0).getName());
    }

    @Test
    public void removeContactTest(){
        assertEquals(true, contactAgenda.addContact(person));
        assertEquals(true, contactAgenda.removeContact(1));
        assertEquals(true, contactAgenda.listPeople().isEmpty());
    }

    @Test
    public void listPeopleTest(){
        assertEquals(true, contactAgenda.addContact(person));
        assertEquals(true, contactAgenda.addContact(person2));
        assertEquals(true, contactAgenda.addContact(person3));
        assertEquals(3, contactAgenda.listPeople().size());
    }

    @Test
    public void findByNameTest(){
        assertEquals(true, contactAgenda.addContact(person));
        assertEquals(true, contactAgenda.addContact(person2));
        assertEquals("teste2@gmail.com", contactAgenda.findByName("Teste2").get(0).getEmail());
        assertEquals(true, contactAgenda.findByName("contatoInexistente").isEmpty());
    }

    @Test
    public void findByIdTest(){
        assertEquals(true, contactAgenda.addContact(person));
        assertEquals(true, contactAgenda.addContact(person2));
        assertEquals("Teste2", contactAgenda.findById(2).getName());
    }

}
