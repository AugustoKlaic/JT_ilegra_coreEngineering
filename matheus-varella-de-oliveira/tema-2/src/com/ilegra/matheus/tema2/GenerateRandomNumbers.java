package com.ilegra.matheus.tema2;


import java.util.Random;


public class GenerateRandomNumbers {

    private int generateNumber() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
    }

    public int generateOddNumber() {
        int randomNumber = generateNumber();
        if (parity(randomNumber)) {
            System.out.println(randomNumber);
        } else {
            System.out.println(++randomNumber);
        }
        return randomNumber;
    }

    public int generateEvenNumber() {
        int randomNumber = generateNumber();
        if (parity(randomNumber)) {
            System.out.println(++randomNumber);
        } else {
            System.out.println(randomNumber);
        }
        return randomNumber;
    }

    private boolean parity(int randomNumber) {
        return (randomNumber % 2 == 0);
    }
}
