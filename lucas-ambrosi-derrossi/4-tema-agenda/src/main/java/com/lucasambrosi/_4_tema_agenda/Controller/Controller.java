package com.lucasambrosi._4_tema_agenda.Controller;

import com.lucasambrosi._4_tema_agenda.Classes.Person;
import com.lucasambrosi._4_tema_agenda.Classes.Printer;
import com.lucasambrosi._4_tema_agenda.Classes.Reader;
import com.lucasambrosi._4_tema_agenda.Model.Agenda;
import java.util.List;

public class Controller {

    private Agenda agenda = new Agenda();

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
        if(agenda.addContact(Reader.readNewPerson()))
            System.out.println("Contact registered!");
        else
            System.out.println("Fail in register.");
    }

    public void remove(){
        if(agenda.removeContact(Reader.readId()))
            System.out.println("Contact removed!");
        else
            System.out.println("Fail on remove.");
    }

    public void list(){
        List<Person> list = agenda.listPeople();
        Printer.printListPeople(list);
    }

    public void listSearchByName(){
        List<Person> listByName = agenda.findByName(Reader.readName());
        if(!listByName.isEmpty())
            Printer.printListPeople(listByName);
        else
            System.out.println("Contact not find.");
    }

    public void listSearchById(){
        Person person = agenda.findById(Reader.readId());
        if(person != null)
            Printer.printPerson(person);
        else
            System.out.println("ID not find.");
    }
}
