package com.lucasambrosi._5_tema_converter;

public class Main {

    public static void main(String[] args){
        System.out.println(Converter.romanToDecimal("xx"));
        System.out.println(Converter.romanToDecimal("XII"));

        System.out.println(Converter.decimalToRoman(10));
        System.out.println(Converter.decimalToRoman(7));
    }
}
