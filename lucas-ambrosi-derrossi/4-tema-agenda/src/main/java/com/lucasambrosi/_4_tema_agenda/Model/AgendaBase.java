package com.lucasambrosi._4_tema_agenda.Model;

import com.lucasambrosi._4_tema_agenda.Classes.Person;
import java.util.List;

public interface AgendaBase {

    boolean addContact(Person person);
    boolean removeContact(int id);
    List<Person> listPeople();
    List<Person> findByName(String name);
    Person findById(int id);

}
