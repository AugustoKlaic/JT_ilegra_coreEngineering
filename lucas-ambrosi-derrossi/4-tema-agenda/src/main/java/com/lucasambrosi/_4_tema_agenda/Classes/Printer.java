package com.lucasambrosi._4_tema_agenda.Classes;

import java.util.ArrayList;

public class Printer {

    public static void printPerson(Person person){
        System.out.println(person.toString());
    }

    public static void printListPeople(ArrayList<Person> list) {
        if (list.isEmpty()){
            System.out.println("Lista vazia.");
        } else {
            for (Person person : list) {
                Printer.printPerson(person);
            }
        }

    }
}
