package com.galvanize.JUnitTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LightSaberTest {
    //SEAT EXAMPLE
    @Test
    public void lightSaberGetColor() {
        //Setup
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        //Execution
        String expected = "green";
        String actual = getColor();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
    @Test
    public void lightSaberGetCharge() {
        //Setup
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        //Execution
        float expected = 100.0f;
        float actual = getCharge();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
    @Test
    public void lightSaberUseCharge() {
        //Setup
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        //Execution
        use(10);

        float expected = 10.0f;
        float actual = getCharge();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
    @Test
    public void lightSaberRemainingTime() {
        //Setup
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        //Execution
        use(10);

        float expected = 10.0f;
        float actual = getRemainingMinutes();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
    public void lightSaberRecharge() {
        //Setup
        LightSaber lightSaber = new LightSaber(jediSerialNumber);
        //Execution
        recharge(0);

        float expected = 100.0f;
        float actual = getCharge();
        //Assertion
        assertEquals(expected, actual);
        //Termination
    }
}