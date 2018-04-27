package com.lucasambrosi._3_tema_tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LampTests {

    private Controller controller1, controller2;
    private Lamp led, fluorescente;

    @Before
    public void before(){
        led = new LED();
        fluorescente = new Fluorescente();
        controller1 = new Controller(led);
        controller2 = new Controller(fluorescente);
    }

    @Test
    public void stateDefault() {
        assertEquals(false, led.getState());
        assertEquals(false, fluorescente.getState());
    }

    @Test
    public void turningOn(){
        led.on();
        assertEquals(true, led.getState());

        fluorescente.on();
        assertEquals(true, fluorescente.getState());
    }

    @Test
    public void turningOff(){
        led.off();
        assertEquals(false, led.getState());

        fluorescente.off();
        assertEquals(false, fluorescente.getState());
    }

    @Test
    public void changingStateOnSwitch(){
        controller1.switcher();
        assertEquals(true, led.getState());
        controller1.switcher();
        assertEquals(false, led.getState());

        controller2.switcher();
        assertEquals(true, fluorescente.getState());
        controller2.switcher();
        assertEquals(false, fluorescente.getState());

    }

}