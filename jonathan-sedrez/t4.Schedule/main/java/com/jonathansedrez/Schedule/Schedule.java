package com.jonathansedrez.Schedule;
import java.util.ArrayList;

public class Schedule {

    ArrayList<Contact> schedule = new ArrayList<Contact>();


    public void add(Contact contact) {   	
    	contact.getName().toLowerCase();
    	schedule.add(contact);        
        System.out.println(contact.getName()+" Adicionado com sucesso");
    }
    
    public void remove(int id) {
        for (int i = 0; i < schedule.size(); i++) {
            if(schedule.get(i).getId() == id) {                
                schedule.remove(i);
                System.out.println("Contact removed!");
            }
        }
    }

    public void list() {
        if(schedule.isEmpty()){
            System.out.println("Empty List");
        } else {
            for (int i = 0; i < schedule.size(); i++) {
                System.out.println("----------Contacts-----------------");
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
            	 System.out.println("---------------------------");
                 System.out.println("ID: "+schedule.get(i).getId());
                 System.out.println("Name: "+schedule.get(i).getName());
                 System.out.println("Email: "+schedule.get(i).getEmail());
                 System.out.println("Fone: "+schedule.get(i).getFone());
            } else {
           	 	System.out.println("---------------------------");
                System.out.println("Not Found!");
            }
        }
    }

    public void searchName(String name) {
        for (int i = 0; i < schedule.size(); i++) {
        	if (schedule.get(i).getName().contains(name)) {
        		ArrayList<Contact> show = new ArrayList<Contact>();        		
        		show.add(schedule.get(i));
                System.out.println("---------------------------");
                System.out.println("ID: "+show.get(i).getId());
                System.out.println("Name: "+show.get(i).getName());
                System.out.println("Email: "+show.get(i).getEmail());
                System.out.println("Fone: "+show.get(i).getFone());
        	} else {
           	 	System.out.println("---------------------------");
           	 	System.out.println("Not Found!");
        	}
        }
    }
}
