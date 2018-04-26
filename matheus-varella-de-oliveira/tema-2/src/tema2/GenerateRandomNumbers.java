package tema2;


import jdk.nashorn.internal.ir.FunctionCall;

import java.util.Random;


public class GenerateRandomNumbers {
    int randomNumber;

    private boolean generateNumber() { //par
        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(100);
        return parity(randomNumber);
    }

    public int generateOddNumber() {
        if (generateNumber()) {
            System.out.println(randomNumber);
        } else {
            System.out.println(++randomNumber);
        }
        return randomNumber;
    }

    public int generateEvenNumber() {
        if (generateNumber()) {
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
