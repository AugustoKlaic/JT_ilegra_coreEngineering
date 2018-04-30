package com.ilegra.lamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NeonTest {
    Neon neonLamp;

    @Before
    public void before() {
        neonLamp = new Neon();
    }

    @Test
    public void getStatus() {
        assertEquals(false, neonLamp.getStatus());
    }
}