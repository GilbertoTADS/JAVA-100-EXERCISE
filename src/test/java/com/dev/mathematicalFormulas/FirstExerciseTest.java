package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FirstExerciseTest {

    @Test
    public void sumTwoNumbers(){
        Integer result = ArithmeticalCalc.sum(4,8);
        assertTrue(result == 12);
    }
    public void subTwoNumbers(){
        Integer result = ArithmeticalCalc.sub(4,8);
        assertTrue(result == 4);
    }
    public void multTwoNumbers(){
        Integer result = ArithmeticalCalc.mult(4,8);
        assertTrue(result == 32);
    }
    public void divTwoNumbers(){
        Integer result = ArithmeticalCalc.div(4,8);
        assertTrue(result == 0.5);
    }
    
}
