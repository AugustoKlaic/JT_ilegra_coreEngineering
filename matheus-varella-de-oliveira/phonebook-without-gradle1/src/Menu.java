import java.util.Scanner;

public class Menu {
    public void menu() {
        Phonebook phonebook = new Phonebook();

        System.out.println("Menu:");
        System.out.println("Para adicionar contato digite 1 e pressione enter");
        System.out.println("Para listar todos os contatos digite 2 e pressione enter");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: //add contato
                Contact contact = phonebook.selectData();
                phonebook.addContact(contact);

                menu();
                break;
            case 2:
                phonebook.listContacts();
                menu();
                break;

            default:
                // The user input an unexpected choice.
        }
    }
}
