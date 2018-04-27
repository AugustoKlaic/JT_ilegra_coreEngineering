import java.util.ArrayList;

public class Phonebook {
    ArrayList<Contact> myList = new ArrayList<Contact>();
//    A lista está zerando ou nao esta adicionando
    Contact littleContact;


    public void addContact(Contact contact) {
        myList.add(contact);
    }

    public Contact selectData() {
        littleContact = new Contact();
        littleContact.setEmail(ScannerData.ScannerEmail());
        littleContact.setName(ScannerData.ScannerName());
        littleContact.setPhonenumber(ScannerData.ScannerNumber());
        return littleContact;
    }

    public void listContacts() {
        System.out.println("zzzzza");
        System.out.println("Quantidade  de contatos na lista:" + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("aaa");
            System.out.print(myList.get(i).getPhonenumber());
            System.out.print(myList.get(i).getName());
            System.out.print(myList.get(i).getEmail());
        }

    }
}
