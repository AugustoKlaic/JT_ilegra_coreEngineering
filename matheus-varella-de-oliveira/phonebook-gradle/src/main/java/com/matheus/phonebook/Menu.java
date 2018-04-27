package com.matheus.phonebook;

import java.util.Scanner;

public class Menu {

    ScannerData scannerData = new ScannerData();
    Phonebook phonebook = new Phonebook();

    public void menu() {
        System.out.println("Menu:");
        System.out.println("Para adicionar contato digite 1 e pressione enter");
        System.out.println("Para listar todos os contatos digite 2 e pressione enter");
        System.out.println("Para remove um contato digite 3 e pressione enter");
        System.out.println("Para encontrar um contato por iD digite 4 e pressione enter");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: //add contato
                Contact contact = phonebook.selectData();
                phonebook.addContact(contact);

                menu();
                break;
            case 2: //list contacts
                phonebook.listContacts();
                menu();
                break;

            case 3: //remove contact by id
                phonebook.removeContactById(scannerData.ScannerId());
                menu();
                break;

            case 4: //find contact by id
                phonebook.findContactById(ScannerData.ScannerId());
                menu();
                break;


            default:
                // The user input an unexpected choice.
        }
    }
}
