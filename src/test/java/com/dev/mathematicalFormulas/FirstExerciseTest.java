package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class FirstExerciseTest {

    @Test
    public void sumTwoNumbers(){
        Double result = ArithmeticalCalc.sum(4.0,8.0);
        assertTrue(result == 12);
    }
    @Test
    public void subTwoNumbers(){
        Double result = ArithmeticalCalc.sub(4.0,8.0);
        assertTrue(result == -4.0);
        Double result2 = ArithmeticalCalc.sub(8.0,4.0);
        assertTrue(result2 == 4);
    }
    @Test
    public void multTwoNumbers(){
        Double result = ArithmeticalCalc.mult(4.0,8.0);
        assertTrue(result == 32);
    }
    @Test
    public void divTwoNumbers(){
        Double result = ArithmeticalCalc.div(4.0,8.0);
        assertTrue(result.equals(0.5));
    }
    @Test
    public void average(){
        Double result = ArithmeticalCalc.avg(Arrays.asList(4.0, 8.0));
        assertTrue(result.equals(6.0));
    }
    
}
