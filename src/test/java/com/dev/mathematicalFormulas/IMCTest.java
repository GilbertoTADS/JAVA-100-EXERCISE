package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IMCTest {
    @Test
    public void imc(){
        IMCenum overweight = IMC.calc(85.0,1.78);
        assertEquals(overweight, IMCenum.OVERWEIGHT);
    }
}
