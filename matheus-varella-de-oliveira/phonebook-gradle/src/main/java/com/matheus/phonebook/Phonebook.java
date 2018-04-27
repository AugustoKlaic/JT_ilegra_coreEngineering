package com.matheus.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    ArrayList<Contact> myList = new ArrayList<Contact>();
    Contact littleContact;
    int incrementId;

    public boolean addContact(Contact contact) {
        return myList.add(contact);
    }

    public Contact selectData() {
        littleContact = new Contact(ScannerData.ScannerName(), ScannerData.ScannerNumber(), ScannerData.ScannerEmail());
        try {
            incrementId = myList.get(myList.size() - 1).getId();
            System.out.println(incrementId);
            littleContact.setId(++incrementId);
        } catch (IndexOutOfBoundsException ex) { }
        return littleContact;
    }

    public void listContacts() {
        System.out.println("Quantidade  de contatos na lista:" + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Lista de contatos:");
            System.out.println(myList.get(i).getPhonenumber());
            System.out.println(myList.get(i).getName());
            System.out.println(myList.get(i).getEmail());
            System.out.println(myList.get(i).getId());
        }
    }

    public void removeContactById(int id) {
        for (int i = 0; i < myList.size(); i++) {
            if (Objects.equals(myList.get(i).getId(), id)) {
                myList.remove(i);
            }
            Contact contact = myList.get(myList.size() - 1);
            System.out.println(contact.getId());
        }
    }

    public void findContactById(int id) {
        for (int i = 0; i < myList.size(); i++) {
            if (Objects.equals(myList.get(i).getId(), id)) {
                System.out.println("Contato encontrado por ID");
                System.out.println(myList.get(i).getPhonenumber());
                System.out.println(myList.get(i).getName());
                System.out.println(myList.get(i).getEmail());
                System.out.println(myList.get(i).getId());
            }
            Contact contact = myList.get(myList.size() - 1);
            System.out.println(contact.getId());
        }
    }


    public void findContactByName(String name) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getName().contains(name)) {
                System.out.println("Contato encontrado por name");
                System.out.println(myList.get(i).getPhonenumber());
                System.out.println(myList.get(i).getName());
                System.out.println(myList.get(i).getEmail());
                System.out.println(myList.get(i).getId());
            }
        }
//fazer construtor e retornar objeto em todos esses metodos pra um metodo print com override p lista, ou qqr outra coisa q possa ter sido retornado daqui
    }
}