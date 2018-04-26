package com.ramonfernandes.testes;

import static org.junit.Test.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import com.ramonfernandes.objects.Contact;
import com.ramonfernandes.objects.ContactList;

public class Testes {

		ContactList lista = new ContactList();
		ContactList lista2 = new ContactList();
		Contact contato1 = new Contact ("Zeca", "zeca@zecamail.com", "123456789");
		Contact contato2 = new Contact ("João", "jao@jaomail.com", "213456789");
		Contact contato3 = new Contact ("Zeca", "zeca2@zecamail.com", "132456789");
	
	@Before
	public void setup() {
		contato1.setId_auxiliar(0);
	}
	
	@Test
	public void isGettingContactById() {
		lista.addContactToList(contato1);
		assertEquals(contato1, lista.getContactById(0));
	}
	
	
	@Test
	public void isAddingAContactToList() {
		assertTrue(lista.getLista().isEmpty());
		lista.addContactToList(contato1);
		assertEquals(contato1, lista.getLista().get(0));
	}
	
	@Test
	public void isRemovingAContactFromList() {
		lista.addContactToList(contato1);
		lista.removeContactFromListById(0);
	}
	
	@Test
	public void isReturningNullIfTryToRemoveAnInexistentContact() {
		assertNull(lista.getContactById(0));
	}
	
	// Verifica se o tamanho do arralist é dois
	// Verifica se contato1 e contato3 estão na sublista
	@Test
	public void isReturningAListWithOneContactUsinggetContactByName() {
		lista.addContactToList(contato1);
		lista.addContactToList(contato2);
		lista.addContactToList(contato3);
		lista2 = lista.getContactByName("Zeca");
		assertEquals(2, lista2.getLista().size());
		assertEquals(contato1, lista2.getContactById(contato1.getId()));
		assertEquals(contato3, lista2.getContactById(contato3.getId()));
	}
	
	

}
