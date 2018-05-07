package com.matheus.phonebook;

import java.util.Scanner;

public class ScannerData {

    public static int scannerNumber() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu numero");
        return reader.nextInt();
    }

    public static String scannerEmail() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu email");
        String email = reader.next();
        return email;
    }

    public static String scannerName() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu nome");
        String name = reader.next();
        return name;
    }

    public static int scannerId() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira o ID que deseja");
        int idToRemove = reader.nextInt();
        return idToRemove;
    }
}
