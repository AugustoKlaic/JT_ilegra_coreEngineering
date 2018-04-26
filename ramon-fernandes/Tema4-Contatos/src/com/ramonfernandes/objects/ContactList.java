package com.ramonfernandes.objects;

import java.util.ArrayList;

public class ContactList {
	
	private ArrayList <Contact> contactList;
	
	public ContactList() {
		this.contactList = new ArrayList<Contact>();
	}

	public void addContactToList(Contact contato) {
		contactList.add(contato);
	}

	public void removeContactFromListById(int id) {
		Contact contactToBeRemoved = getContactById(id);
		if (contactToBeRemoved != null) {
			System.out.println("Removendo... \n" + contactToBeRemoved.toString());
			contactList.remove(contactToBeRemoved);
			System.out.println("Contato removido");
		}else
			System.out.println("Contato inexistente");
	}

	public Contact getContactById(int id) {
		
		Contact c = null;
		
		for (Contact contact : contactList) {
			if(contact.getId() == id) {
				c = contact;
			}
		}
		return c;
	}
	
	public ContactList getContactByName(String name) {
		ContactList sublista = new ContactList();
		for (Contact contact : contactList) {
			if(contact.getNome().equals(name)) {
				sublista.addContactToList(contact);
			}
		}
		return sublista;
	}
	
	public void printList() {
		for (Contact contact : contactList) {
			System.out.println(contact.toString());
		}
	}
	
	public ArrayList getLista() {
		return contactList;
	}
}
