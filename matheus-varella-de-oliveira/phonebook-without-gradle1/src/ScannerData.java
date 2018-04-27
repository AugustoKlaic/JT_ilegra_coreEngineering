import java.util.Scanner;

public class ScannerData {
    public static int ScannerNumber() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu numero");
        int phonenumber = reader.nextInt();
        return phonenumber;
    }

    public static String ScannerEmail() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu email");
        String email = reader.next();
        return email;
    }

    public static String ScannerName() {
        Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Insira seu name");
        String name = reader.next();
        return name;
    }
}

/*
1 - remove duplicate lines 5, 12, 19
2 - use overreading/overloading to create just scanner method
*/
