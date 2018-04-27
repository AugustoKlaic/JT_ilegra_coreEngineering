import java.util.ArrayList;

public class Phonebook {
    ArrayList<Contact> myList = new ArrayList<Contact>();


    public void addContact(Contact contact) {
        myList.add(contact);
        System.out.println(myList.get(0).getEmail());
    }
}
