package com.galvanize.JUnitTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LaptopTest {
    //SEAT EXAMPLE
    @Test
    public void itIsOffByDefault() {
        //Setup
        Laptop laptop = new Laptop();
        //Execution
        boolean expected = false;
        boolean actual = laptop.isOn();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
    @Test
    public void callingPowerTurnsItOn() {
            //Setup
            Laptop laptop = new Laptop();
            //Execution
        laptop.power();
            boolean expected = true;
            boolean actual = laptop.isOn();
            //Assertion
            assertEquals(expected, laptop.isOn());
            //Termination

    }

    @Test
    public void callingPowerTurnsItOff() {
        //Setup
        Laptop laptop = new Laptop();
        //Execution
        laptop.power();
        boolean expected = false;
        boolean actual = laptop.isOn();
        //Assertion
        assertEquals(expected, laptop.isOn());
        //Termination
    }

    @Test
    public void itCanBePutToSleep() {
        //Setup
        Laptop laptop = new Laptop();
        //Execution
        laptop.power();
        laptop.sleep();

        //Assertion
        assertEquals(true, laptop.isOn());
        assertEquals(true, laptop.isSleeping());
        //Termination
    }

    @Test
    public void itCanWakeUp() {
        //Setup
        Laptop laptop = new Laptop();
        //Execution
        laptop.power();
        laptop.sleep();
        laptop.power();

        //Assertion
        assertEquals(true, laptop.isOn());
        assertEquals(false, laptop.isSleeping());
        //Termination
    }
}

