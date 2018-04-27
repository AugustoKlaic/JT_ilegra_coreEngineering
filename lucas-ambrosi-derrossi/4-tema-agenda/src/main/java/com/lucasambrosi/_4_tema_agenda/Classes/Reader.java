package com.lucasambrosi._4_tema_agenda.Classes;

import java.util.Scanner;

public class Reader {

    private static int id;

    public static Person readNewPerson(){
        System.out.print("\nInforme o nome da pessoa: ");
        String name = new Scanner(System.in).nextLine();

        System.out.print("\nInforme o o email da pessoa: ");
        String email = new Scanner(System.in).nextLine();

        System.out.print("\nInforme o telefone da pessoa: ");
        String phone = new Scanner(System.in).nextLine();

        ++id;

        return new Person(id, name, email, phone);
    }

    public static int readId(){
        System.out.print("\nInforme o id da pessoa: ");
        return new Scanner(System.in).nextInt();
    }

    public static String readName() {
        System.out.print("\nInforme o nome da pessoa para localizar: ");
        return new Scanner(System.in).nextLine();
    }
}
