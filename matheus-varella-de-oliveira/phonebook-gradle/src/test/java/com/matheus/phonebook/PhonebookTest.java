package com.matheus.phonebook;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhonebookTest {

    ArrayList<Contact> myListTest;
    Phonebook phonebookTest;
    Contact contactTest;

    @Before
    public void before() {
        myListTest = new ArrayList<Contact>();
        phonebookTest = new Phonebook();
        contactTest = new Contact("Matheus", 5444, "matheus.matheus@matheus.mat");
    }

    @Test
    public void addContactTest() {
        assertTrue(phonebookTest.addContact(contactTest));
    }

}
/*Como testar que o método addContact realmente add contact
1 - mostrar q apos a chamada do metodo a lista muda
2 - mostrar q apos a chamada do metodo a lista cresce
3 - mostrar q apos a chamada do metodo a lista é diferente de 0
4 - comparar usuario mock com usuario na list apos a chamada do metodo
 */

/*Como testar o método selectDataTest
1 - mostrar que apos a chamada do metodo o objetivo retornado nao é nulo

1 - mostrar que apos a chamada do metodo o objetivo retornado tem nome
1 - mostrar que apos a chamada do metodo o objetivo retornado tem email
1 - mostrar que apos a chamada do metodo o objetivo retornado tem numero
1 - mostrar que apos a chamada do metodo o objetivo retornado tem id
*/

