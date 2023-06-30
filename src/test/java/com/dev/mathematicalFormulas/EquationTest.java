package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EquationTest {

    @Test
    public void quadractEquation(){
        Double delta = Equation.quadract(1.0,2.0,-3.0);
        assertEquals((Double)16.0,delta);

    }
}
