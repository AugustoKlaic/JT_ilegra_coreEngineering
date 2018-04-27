import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact littleContact;
        littleContact = new Contact();

        littleContact.setEmail(ScannerData.ScannerEmail());
        littleContact.setName(ScannerData.ScannerName());
        littleContact.setPhonenumber(ScannerData.ScannerNumber());
        Phonebook lixo = new Phonebook();
        lixo.addContact(littleContact);


    }
}
