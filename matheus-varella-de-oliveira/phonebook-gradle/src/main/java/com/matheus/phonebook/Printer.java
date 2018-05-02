package com.matheus.phonebook;

import java.util.List;

public class Printer {
    public void printer(Contact contact) {
        System.out.println("Numero do contato: " + contact.getPhonenumber());
        System.out.println("Nome do contato: " + contact.getName());
        System.out.println("Email do contato: " + contact.getEmail());
        System.out.println("ID do contato: " + contact.getId());
    }

    public void printer(List<Contact> contactList) {
        System.out.println("Lista de contatos:");
        for (int i = 0; i < contactList.size(); i++) {
            printer(contactList.get(i));
        }
    }
}