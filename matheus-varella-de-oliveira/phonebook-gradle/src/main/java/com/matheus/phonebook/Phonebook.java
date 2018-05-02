package com.matheus.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {
    List<Contact> myList = new ArrayList<>();

    public boolean addContact(Contact contact) {
        return myList.add(contact);
    }


    public Contact selectData() {
        int incrementId;
        Contact contact = new Contact(
                ScannerData.scannerName(),
                ScannerData.scannerNumber(),
                ScannerData.scannerEmail());
        try {
            incrementId = myList.get(myList.size() - 1).getId();
            contact.setId(++incrementId);
        } catch (IndexOutOfBoundsException ex) {
        }
        return contact;
    }

    public List<Contact> listContacts() {
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

    public List<Contact> findContactByName(String name) {
        ArrayList<Contact> foundContactList = new ArrayList<>();
        for (Contact contact : myList) {
            if (contact.getName().contains(name)) {
                foundContactList.add(contact);
            }
        }
        return foundContactList;
    }
}