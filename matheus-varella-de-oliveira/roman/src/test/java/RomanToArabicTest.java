import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToArabicTest {
    RomanToArabic romanToArabic;
    @Before
    public void initialize(){
        romanToArabic = new RomanToArabic();
    }

    @Test
    public void toArabicTranslateTest() {
        assertEquals(1, romanToArabic.toArabicTranslate("I"));
        assertEquals(2, romanToArabic.toArabicTranslate("II"));
        assertEquals(3, romanToArabic.toArabicTranslate("III"));
        assertEquals(4, romanToArabic.toArabicTranslate("IV"));
        assertEquals(5, romanToArabic.toArabicTranslate("V"));
        assertEquals(6, romanToArabic.toArabicTranslate("VI"));
        assertEquals(7, romanToArabic.toArabicTranslate("VII"));
        assertEquals(8, romanToArabic.toArabicTranslate("VIII"));
        assertEquals(9, romanToArabic.toArabicTranslate("IX"));
        assertEquals(10, romanToArabic.toArabicTranslate("X"));
        assertEquals(11, romanToArabic.toArabicTranslate("XI"));
        assertEquals(12, romanToArabic.toArabicTranslate("XII"));
        assertEquals(13, romanToArabic.toArabicTranslate("XIII"));
        assertEquals(14, romanToArabic.toArabicTranslate("XIV"));
        assertEquals(15, romanToArabic.toArabicTranslate("XV"));
        assertEquals(16, romanToArabic.toArabicTranslate("XVI"));
        assertEquals(17, romanToArabic.toArabicTranslate("XVII"));
        assertEquals(18, romanToArabic.toArabicTranslate("XVIII"));
        assertEquals(19, romanToArabic.toArabicTranslate("XIX"));
        assertEquals(20, romanToArabic.toArabicTranslate("XX"));
    }
}
