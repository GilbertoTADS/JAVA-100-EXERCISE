package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.dev.mathematicalFormulas.ArithmeticalCalc;

public class FirstExerciseTest {

    @Test
    public void sumTwoNumbers(){
        Double result = ArithmeticalCalc.sum(4.0,8.0);
        assertTrue(result == 12);
    }
    public void subTwoNumbers(){
        Double result = ArithmeticalCalc.sub(4.0,8.8);
        assertTrue(result == 4);
    }
    public void multTwoNumbers(){
        Double result = ArithmeticalCalc.mult(4.0,8.0);
        assertTrue(result == 32);
    }
    public void divTwoNumbers(){
        Double result = ArithmeticalCalc.div(4.0,8.0);
        assertTrue(result.equals(0.5));
    }
    
}
