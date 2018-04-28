package com.lucasambrosi._4_tema_agenda.Model;

import com.lucasambrosi._4_tema_agenda.Classes.Person;
import java.util.ArrayList;
import java.util.List;

public class Agenda implements AgendaBase {

    private List<Person> agendaList = new ArrayList<>();

    @Override
    public boolean addContact(Person person) {
        return agendaList.add(person);
    }

    @Override
    public boolean removeContact(int id) {
        if(!agendaList.isEmpty() && id >= 0){
            Person deletePerson = findById(id);
            return agendaList.remove(deletePerson);
        }
        return false;
    }

    @Override
    public List<Person> listPeople() {
        return agendaList;
    }

    @Override
    public List<Person> findByName(String name) {

        List<Person> returnList = new ArrayList<>();

        if(!name.trim().equals("")){
            for(Person person : agendaList){
                String[] firstName = person.getName().toLowerCase().split(" ");
                if(firstName[0].contains(name.toLowerCase())){
                    returnList.add(person);
                }
            }
        }
        return returnList;
    }

    @Override
    public Person findById(int id) {

        if(!agendaList.isEmpty())
            for(Person person : agendaList){
                if(person.getId() == id)
                    return person;
            }
        return null;
    }
}
