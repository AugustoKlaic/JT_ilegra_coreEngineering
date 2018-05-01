package com.lucasambrosi._5_tema_converter;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void decimalToRomanTest(){
        assertEquals("III", Converter.decimalToRoman(3));
        assertEquals("XII", Converter.decimalToRoman(12));
        assertEquals("XVI", Converter.decimalToRoman(16));
    }

    @Test
    public void romanToDecimalTest(){
        assertEquals(5, Converter.romanToDecimal("V"));
        assertEquals(9, Converter.romanToDecimal("ix"));
        assertEquals(19, Converter.romanToDecimal("XIX"));
    }

}