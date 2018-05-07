package com.matheus.phonebook;

public class Identifier {

    private static int id = 0;

    public synchronized static int generateId(){
        return ++id;
    }
}
