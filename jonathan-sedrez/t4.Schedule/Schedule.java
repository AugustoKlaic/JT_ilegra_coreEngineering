package com.jonathansedrez.Schedule;
import java.util.ArrayList;

public class Schedule {

    ArrayList<Contact> schedule = new ArrayList<Contact>();

    public void add(Contact contact) {
        schedule.add(contact);
        System.out.println(contact.getName()+" Adicionado com sucesso");
    }

    public void remove(int id) {
        for (int i = 0; i < schedule.size(); i++) {
            if(schedule.get(i).getId() == id) {
                //System.out.println(schedule.get(i).getId());
                schedule.remove(i);
                System.out.print("Contact removed!");
            }
        }
    }

    public void list() {
        if(schedule.isEmpty()){
            System.out.println("Empty List");
        } else {
            for (int i = 0; i < schedule.size(); i++) {
                System.out.println("---------------------------");
                System.out.println("ID: "+schedule.get(i).getId());
                System.out.println("Name: "+schedule.get(i).getName());
                System.out.println("Email: "+schedule.get(i).getEmail());
                System.out.println("Fone: "+schedule.get(i).getFone());
            }
        }
    }

    public void searchId(int id) {
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getId() == id) {
                System.out.println(schedule.get(i));
            } else {
                System.out.println("Not Found");
            }
        }
    }

    public void searchName(String name) {
        System.out.println();
    }
}
