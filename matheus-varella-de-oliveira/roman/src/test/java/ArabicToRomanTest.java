import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicToRomanTest {
    ArabicToRoman arabicToRoman;
    @Before
    public void initialize(){
    arabicToRoman = new ArabicToRoman();
    }

    @Test
    public void toRomanTest() {
        assertEquals("I", arabicToRoman.toRoman(1));
        assertEquals("II", arabicToRoman.toRoman(2));
        assertEquals("III", arabicToRoman.toRoman(3));
        assertEquals("IV", arabicToRoman.toRoman(4));
        assertEquals("V", arabicToRoman.toRoman(5));
        assertEquals("VI", arabicToRoman.toRoman(6));
        assertEquals("VII", arabicToRoman.toRoman(7));
        assertEquals("VIII", arabicToRoman.toRoman(8));
        assertEquals("IX", arabicToRoman.toRoman(9));
        assertEquals("X", arabicToRoman.toRoman(10));
        assertEquals("XI", arabicToRoman.toRoman(11));
        assertEquals("XII", arabicToRoman.toRoman(12));
        assertEquals("XIII", arabicToRoman.toRoman(13));
        assertEquals("XIV", arabicToRoman.toRoman(14));
        assertEquals("XV", arabicToRoman.toRoman(15));
        assertEquals("XVI", arabicToRoman.toRoman(16));
        assertEquals("XVII", arabicToRoman.toRoman(17));
        assertEquals("XVIII", arabicToRoman.toRoman(18));
        assertEquals("XIX", arabicToRoman.toRoman(19));
        assertEquals("XX", arabicToRoman.toRoman(20));
    }
}

