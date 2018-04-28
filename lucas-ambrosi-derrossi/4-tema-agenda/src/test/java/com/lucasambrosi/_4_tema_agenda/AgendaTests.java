package com.lucasambrosi._4_tema_agenda;

import com.lucasambrosi._4_tema_agenda.Classes.Person;
import com.lucasambrosi._4_tema_agenda.Model.Agenda;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgendaTests {

    private Agenda agenda;
    private Person person, person2, person3;

    @Before
    public void before(){
        agenda = new Agenda();
        person = new Person(1, "Teste1", "teste1@gmail.com", "91234-5678");
        person2 = new Person(2, "Teste2", "teste2@gmail.com", "98765-4321");
        person3 = new Person(3, "Teste3", "teste3@gmail.com", "98471-7352");

    }

    @Test
    public void addContactTest(){
        assertEquals(true, agenda.addContact(person));
        assertEquals("Teste1", agenda.listPeople().get(0).getName());
    }

    @Test
    public void removeContactTest(){
        assertEquals(true, agenda.addContact(person));
        assertEquals(true, agenda.removeContact(1));
        assertEquals(true, agenda.listPeople().isEmpty());
    }

    @Test
    public void listPeopleTest(){
        assertEquals(true, agenda.addContact(person));
        assertEquals(true, agenda.addContact(person2));
        assertEquals(true, agenda.addContact(person3));
        assertEquals(3, agenda.listPeople().size());
    }

    @Test
    public void findByNameTest(){
        assertEquals(true, agenda.addContact(person));
        assertEquals(true, agenda.addContact(person2));
        assertEquals("teste2@gmail.com", agenda.findByName("Teste2").get(0).getEmail());
        assertEquals(true, agenda.findByName("contatoInexistente").isEmpty());
    }

    @Test
    public void findByIdTest(){
        assertEquals(true, agenda.addContact(person));
        assertEquals(true, agenda.addContact(person2));
        assertEquals("Teste2", agenda.findById(2).getName());
    }

}
