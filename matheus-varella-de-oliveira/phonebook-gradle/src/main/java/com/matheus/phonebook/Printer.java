package com.matheus.phonebook;

import java.util.ArrayList;

public class Printer {
    public void printerContact(Contact contact) {
        System.out.println(contact.getPhonenumber());
        System.out.println(contact.getName());
        System.out.println(contact.getEmail());
        System.out.println(contact.getId());
    }

    public void listContactsPrinter(ArrayList<Contact> myList) {
        System.out.println("Lista de contatos:");
        for (int i = 0; i < myList.size(); i++) {
            printerContact(myList.get(i));
        }
    }


}
