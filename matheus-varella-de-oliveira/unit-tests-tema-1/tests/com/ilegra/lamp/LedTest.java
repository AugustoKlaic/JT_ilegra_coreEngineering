package com.ilegra.lamp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LedTest {
    Led ledLamp;

    @Before
    public void before() {
        ledLamp = new Led();
    }

    @Test
    public void testLedStatus() {
        assertEquals(false, ledLamp.getStatus());
    }

}