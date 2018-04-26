package com.lucasambrosi._2_tema_multithread;

import java.util.Random;

/**
 * @param parity - defines if the number is odd or even (default: even)
 */
public class GenerateNumber {

    public static int generate(boolean parity){
        int number = new Random().nextInt(250);

        if(isIncorrectParity(parity, number))
            return ++number;

        return number;
    }

    private static boolean isOdd(int num){
        return (num % 2 == 0);
    }

    private static boolean isIncorrectParity(boolean parity, int num){
        return (parity != isOdd(num));
    }
}
