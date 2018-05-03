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
    public void toArabicTest() {
        assertEquals(1, romanToArabic.toArabic("I"));
        assertEquals(2, romanToArabic.toArabic("II"));
        assertEquals(3, romanToArabic.toArabic("III"));
        assertEquals(4, romanToArabic.toArabic("IV"));
        assertEquals(5, romanToArabic.toArabic("V"));
        assertEquals(6, romanToArabic.toArabic("VI"));
        assertEquals(7, romanToArabic.toArabic("VII"));
        assertEquals(8, romanToArabic.toArabic("VIII"));
        assertEquals(9, romanToArabic.toArabic("IX"));
        assertEquals(10, romanToArabic.toArabic("X"));
        assertEquals(11, romanToArabic.toArabic("XI"));
        assertEquals(12, romanToArabic.toArabic("XII"));
        assertEquals(13, romanToArabic.toArabic("XIII"));
        assertEquals(14, romanToArabic.toArabic("XIV"));
        assertEquals(15, romanToArabic.toArabic("XV"));
        assertEquals(16, romanToArabic.toArabic("XVI"));
        assertEquals(17, romanToArabic.toArabic("XVII"));
        assertEquals(18, romanToArabic.toArabic("XVIII"));
        assertEquals(19, romanToArabic.toArabic("XIX"));
        assertEquals(20, romanToArabic.toArabic("XX"));
    }
}
