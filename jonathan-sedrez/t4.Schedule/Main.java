package com.jonathansedrez.Schedule;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);

        //Cria um usuário da agenda
        Schedule user = new Schedule();

        boolean opc = true;
        while(opc == true){
            System.out.println("---------------------");
            System.out.println("Chose a option");
            System.out.println("[1] Add");
            System.out.println("[2] Remove");
            System.out.println("[3] List");
            System.out.println("[4] Search");

            int inputChoice;
            inputChoice = input.nextInt();

            switch (inputChoice) {
                case 1:
                    String name;
                    String email;
                    String fone;

                    System.out.print("Contact name: ");
                    name = input.next();
                    System.out.print("Contact email: ");
                    email = input.next();
                    System.out.print("Contact fone: ");
                    fone = input.next();

                    user.add(new Contact(name, email, fone));
                    break;
                case 2:
                    System.out.println("Enter ID contact to remove");
                    int id = input.nextInt();
                    user.remove(id);
                    System.out.println("Contact removed!");
                    break;
                case 3:
                    user.list();
                    break;
                case 4:
                    System.out.println("[1] Search by ID");
                    System.out.println("[2] Search by Name");
                    int SearchChoice = input.nextInt();
                    switch (SearchChoice) {
                        case 1:
                            System.out.print("ID: ");
                            int bla = input.nextInt();
                            user.searchId(bla);
                            break;
                        case 2:
                            System.out.print("Name: ");
                            String SearchName = input.next();
                            user.searchName(SearchName);
                            break;
                        default:
                            System.out.println("Invalid command!");
                    }
                    break;
                default:
                    System.out.println("Invalid command!");
            }
            //Questiona se usuário deseja continuar operando
            System.out.println("---------------------");
            System.out.println("Enter 1 to continue");
            int check = input.nextInt();
            if(check != 1){
                System.out.println("Good bye!");
                opc=false;
            }
        }
    }
}
