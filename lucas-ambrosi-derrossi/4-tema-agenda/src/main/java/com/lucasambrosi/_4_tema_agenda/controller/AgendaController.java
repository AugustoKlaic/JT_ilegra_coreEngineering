package com.lucasambrosi._4_tema_agenda.controller;

import com.lucasambrosi._4_tema_agenda.pojo.Person;
import com.lucasambrosi._4_tema_agenda.io.Printer;
import com.lucasambrosi._4_tema_agenda.io.Reader;
import com.lucasambrosi._4_tema_agenda.agenda.ContactAgenda;
import java.util.List;

public class AgendaController {

    private ContactAgenda contactAgenda = new ContactAgenda();

    public void option(int op){
        switch (op){
            case 1:
                add();
                break;
            case 2:
                remove();
                break;
            case 3:
                list();
                break;
            case 4:
                listSearchByName();
                break;
            case 5:
                listSearchById();
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void add(){
        if(contactAgenda.addContact(Reader.readNewPerson()))
            System.out.println("Contact registered!");
        else
            System.out.println("Fail in register.");
    }

    public void remove(){
        if(contactAgenda.removeContact(Reader.readId()))
            System.out.println("Contact removed!");
        else
            System.out.println("Fail on remove.");
    }

    public void list(){
        List<Person> list = contactAgenda.listPeople();
        Printer.printListPeople(list);
    }

    public void listSearchByName(){
        List<Person> listByName = contactAgenda.findByName(Reader.readName());
        if(!listByName.isEmpty())
            Printer.printListPeople(listByName);
        else
            System.out.println("Contact not find.");
    }

    public void listSearchById(){
        Person person = contactAgenda.findById(Reader.readId());
        if(person != null)
            Printer.printPerson(person);
        else
            System.out.println("ID not find.");
    }
}
