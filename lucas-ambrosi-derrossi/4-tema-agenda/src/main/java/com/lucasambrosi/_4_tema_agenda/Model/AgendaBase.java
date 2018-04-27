package com.lucasambrosi._4_tema_agenda.Model;

import com.lucasambrosi._4_tema_agenda.Classes.Person;

import java.util.ArrayList;

public interface AgendaBase {

    boolean addContact(Person person);
    boolean removeContact(int id);
    ArrayList<Person> listPeople();
    ArrayList<Person> findByName(String name);
    Person findById(int id);

}
