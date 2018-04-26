package com.jonathansedrez.Schedule;

import java.util.Scanner;

public class Main {

	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Welcome to JT's Schedule. What do you want to do? \n");
		System.out.println("[1] Add");
		System.out.println("[2] Remove");
		System.out.println("[3] List");
		System.out.println("[4] Search");
		
		int inputChoice;
		inputChoice = input.nextInt();
		Schedule user = new Schedule();  
		
		switch(inputChoice) {
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
				break;
			case 3:
				user.list();
				break;
			case 4:
				System.out.println("[1] Searsh by ID");
				System.out.println("[2] Searsh by Name");
				int SearchChoice = input.nextInt();
				switch(SearchChoice) {
					case 1:
						System.out.print("ID: ");
						int id = input.nextInt();
						user.searchId(id);
						break;
					case 2:
						System.out.print("Name: ");
						String SearchName = input.next();
						user.searchName(SearchName);
						break;
					default:
						System.out.println("Invalid comand!");
				}
				
				break;
			default:
				System.out.println("Invalid comand!");
		}		
	}
}
