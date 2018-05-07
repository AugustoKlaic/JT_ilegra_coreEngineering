package com.matheus.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {
    private List<Contact> contactList = new ArrayList<>();

    public boolean addContact(Contact contact) {
        return contactList.add(contact);
    }

    public Contact selectData() {
        Contact contact = new Contact(
                ScannerData.scannerName(),
                ScannerData.scannerNumber(),
                ScannerData.scannerEmail());
        try {
            contact.setId(Identifier.generateId());
        } catch (IndexOutOfBoundsException ex) {

        }
        return contact;
    }

    public List<Contact> listContacts() {
        System.out.println("Quantidade  de contatos na lista:" + contactList.size());
        return contactList;
    }

    public Contact removeContactById(int id) {
        return contactList.remove(id);
    }

    public Contact findContactById(int id) {
        for (Contact contact : contactList) {
            if (Objects.equals(contact.getId(), id)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> findContactByName(String name) {
        List<Contact> foundContactList = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getName().contains(name)) {
                foundContactList.add(contact);
            }
        }
        return foundContactList;
    }
}