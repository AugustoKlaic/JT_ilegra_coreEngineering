package com.matheus.phonebook;

import java.util.Scanner;

public class Menu {

    ScannerData scannerData = new ScannerData();
    Phonebook phonebook = new Phonebook();
    Printer printer = new Printer();

    public void menu() {
        System.out.println("Menu:");
        System.out.println("1 - Para adicionar contato");
        System.out.println("2 - Para listar todos os contatos");
        System.out.println("3 - Para remover um contato pelo ID");
        System.out.println("4 - Para encontrar um contato pelo ID");
        System.out.println("5 - Para encontrar um por nome");
        System.out.println("Digite a opção desejada e pressione ENTER");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: //add contato
                Contact contact = phonebook.selectData();
                phonebook.addContact(contact);

                menu();
                break;
            case 2: //list contacts
                printer.printer(phonebook.listContacts());
                menu();
                break;

            case 3: //remove contact by id
                phonebook.removeContactById(phonebook.findContactById(scannerData.ScannerId()).getId());
                menu();
                break;

            case 4: //find contact by id
                printer.printer(phonebook.findContactById(ScannerData.ScannerId()));
                menu();
                break;

            case 5: //find contact by name
                printer.printer(phonebook.findContactByName(ScannerData.ScannerName()));
                menu();
                break;

            default:
                System.out.println("Opção inválida");
                menu();
                break;
                // The user input an unexpected choice.
        }
    }
}
