package com.lucasambrosi._5_tema_converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    private static List<Integer> decimalNumbers = new ArrayList<>(Arrays.asList(1, 4, 5, 9, 10));
    private static List<String> romanNumbers = new ArrayList<>(Arrays.asList("I", "IV", "V", "IX", "X"));

    public static String decimalToRoman(int number){

        String resultNumber = "";
        for(int i = decimalNumbers.size() - 1; i >= 0; i--){
            int integerPart = number / decimalNumbers.get(i);
            number -= decimalNumbers.get(i) * integerPart;

            for(int j = 0; j < integerPart; j++){
                resultNumber += romanNumbers.get(i);
            }
        }
        return resultNumber;
    }

    public static int romanToDecimal(String number){

        int resultNumber = 0;
        char[] splittedNumber = number.toUpperCase().toCharArray();

        int lastPosition = splittedNumber.length-1;

        for(int i = lastPosition; i >= 0; i--){

            int decimalIndex = romanNumbers.indexOf(String.valueOf(splittedNumber[i]));
            if(i == lastPosition){
                resultNumber += decimalNumbers.get(decimalIndex);

            } else if(splittedNumber[i] >= splittedNumber[i+1]){
                resultNumber += decimalNumbers.get(decimalIndex);

            } else {
                resultNumber -= decimalNumbers.get(decimalIndex);
            }
        }
        return resultNumber;
    }
}
