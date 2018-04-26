package com.jonathansedrez.Schedule;

public class Contact {

    private int id = 0;
    private String name;
    private String email;
    private String fone;

    //Constructor without ID
    public Contact(String name, String email, String fone) {
        this.id =+ 1;
        this.name = name;
        this.email = email;
        this.fone = fone;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getFone() {
        return fone;
    }
}