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
            case 1:
                Contact contact = phonebook.selectData();
                phonebook.addContact(contact);
                menu();
                break;
            case 2:
                printer.printer(phonebook.listContacts());
                menu();
                break;
            case 3:
                phonebook.removeContactById(phonebook.findContactById(scannerData.scannerId()).getId());
                menu();
                break;
            case 4:
                printer.printer(phonebook.findContactById(ScannerData.scannerId()));
                menu();
                break;
            case 5:
                printer.printer(phonebook.findContactByName(ScannerData.scannerName()));
                menu();
                break;
            default:
                System.out.println("Opção inválida");
                menu();
                break;
        }
    }
}
