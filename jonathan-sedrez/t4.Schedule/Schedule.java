package com.jonathansedrez.Schedule;
import java.util.ArrayList;

public class Schedule {
	
	ArrayList<Contact> schedule = new ArrayList<Contact>();

	public void add(Contact contact) {
		schedule.add(contact);
	}
	
	public void remove(int id) {
		for (int i = 0; i < schedule.size(); i++) {
			if(schedule.get(i).getId() == id) {
				schedule.remove(i);
				System.out.print("Contact removed!");
			}
		}	
	}
	
	public void list() {
		for (int i = 0; i < schedule.size(); i++) {
			System.out.println(schedule.get(i)+"\n");
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
