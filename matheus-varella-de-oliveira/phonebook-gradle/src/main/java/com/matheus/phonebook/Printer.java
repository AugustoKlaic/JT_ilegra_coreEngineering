package com.matheus.phonebook;

import java.util.List;

public class Printer {
    public void printer(Contact contact) {
        System.out.println("Numero do contato: " + contact.getPhonenumber());
        System.out.println("Nome do contato: " + contact.getName());
        System.out.println("Email do contato: " + contact.getEmail());
        System.out.println("ID do contato: " + contact.getId());
    }

    public void printer(List<Contact> myList) {
        System.out.println("Lista de contatos:");
        for (int i = 0; i < myList.size(); i++) {
            printer(myList.get(i));
        }
    }
}