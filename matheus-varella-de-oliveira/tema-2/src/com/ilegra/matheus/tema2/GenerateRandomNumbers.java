package com.ilegra.matheus.tema2;


import java.util.Random;


public class GenerateRandomNumbers {

    private int generateNumber() {
//        int randomNumber;
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(100);
//        return randomNumber;
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
