package com.ilegra.matheus.tema2;


import java.util.Random;


public class GenerateRandomNumbers {
    int randomNumber;

    private int generateNumber() {
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(100);
        return randomNumber;
    }

    public int generateOddNumber() {
        generateNumber();
        if (parity(randomNumber)) {
            System.out.println(randomNumber);
        } else {
            System.out.println(++randomNumber);
        }
        return randomNumber;
    }

    public int generateEvenNumber() {
        generateNumber();
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
