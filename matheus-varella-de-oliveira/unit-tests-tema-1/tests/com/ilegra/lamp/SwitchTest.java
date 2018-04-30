package com.ilegra.lamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchTest {
    Led testLedLamp;
    Neon testNeonLamp;

    Switch switchTestNeon;
    Switch switchTestLed;


    @Before
    public void before() {
        testNeonLamp = new Neon();
        switchTestNeon = new Switch(testNeonLamp);
        testLedLamp = new Led();
        switchTestLed = new Switch(testLedLamp);
    }

    @Test
    public void testSwitchChangeStatusNeonLamp() {
        assertEquals(false, testNeonLamp.getStatus());
        switchTestNeon.switcher();
        assertEquals(true, testNeonLamp.getStatus());
    }

    @Test
    public void testSwitchChangeStatusLedLamp() {
        assertEquals(false, testLedLamp.getStatus());
        switchTestLed.switcher();
        assertEquals(true, testLedLamp.getStatus());
    }
}