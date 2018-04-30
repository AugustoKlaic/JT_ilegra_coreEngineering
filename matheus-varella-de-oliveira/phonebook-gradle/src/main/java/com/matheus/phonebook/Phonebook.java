package com.matheus.phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    ArrayList<Contact> myList = new ArrayList<Contact>();

    public boolean addContact(Contact contact) {
        return myList.add(contact);
    }

    public Contact selectData() {
        Contact contact;
        int incrementId;
        contact = new Contact(
                ScannerData.ScannerName(),
                ScannerData.ScannerNumber(),
                ScannerData.ScannerEmail());
        try {
            incrementId = myList.get(myList.size() - 1).getId();
            contact.setId(++incrementId);
        } catch (IndexOutOfBoundsException ex) {
        }
        return contact;
    }

    public ArrayList<Contact> listContacts() {
        System.out.println("Quantidade  de contatos na lista:" + myList.size());
        return myList;
    }

    public Contact removeContactById(int id) {
        return myList.remove(id);
    }

    public Contact findContactById(int id) {
        for (Contact contact : myList) {
            if (Objects.equals(contact.getId(), id)) {
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> findContactByName(String name) {
        ArrayList<Contact> foundContactList = new ArrayList<>();
        for (Contact contact : myList) {
            if (contact.getName().contains(name)) {
                foundContactList.add(contact);
            }
        }
        return foundContactList;
    }
}
//fazer construtor e retornar objeto em todos esses metodos pra um metodo print com override p lista, Contato ou qqr outra coisa q possa ter sido retornado daqui
