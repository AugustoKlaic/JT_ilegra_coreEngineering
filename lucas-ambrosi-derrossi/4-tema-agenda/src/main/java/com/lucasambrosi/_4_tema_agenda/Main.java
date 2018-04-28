package com.lucasambrosi._4_tema_agenda;

import com.lucasambrosi._4_tema_agenda.Controller.Controller;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Controller controller = new Controller();
        int op;

        do{
            System.out.println("=======Agenda======\n"
                              + "[1] Add contact\n"
                              + "[2] Remove contact\n"
                              + "[3] List contacts\n"
                              + "[4] Find contact by name\n"
                              + "[5] Find contact by ID\n"
                              + "[6] Exit");

            System.out.print("Choose an option: ");
            op = new Scanner(System.in).nextInt();
            controller.option(op);
        }while (op != 6);
    }
}
