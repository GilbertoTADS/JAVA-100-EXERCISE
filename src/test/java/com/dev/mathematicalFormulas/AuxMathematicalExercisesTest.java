package com.dev.mathematicalFormulas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuxMathematicalExercisesTest {

    @Test
    public void findPrimeNumbers(){
       boolean one = ArithmeticalCalc.isPrime(1);
       boolean two = ArithmeticalCalc.isPrime(2);
       boolean three = ArithmeticalCalc.isPrime(3);
       boolean four = ArithmeticalCalc.isPrime(4);
       boolean five = ArithmeticalCalc.isPrime(5);
       boolean twentOne = ArithmeticalCalc.isPrime(21);
       boolean twenth = ArithmeticalCalc.isPrime(20);
       assertTrue(one);
       assertTrue(two);
       assertTrue(three);
       assertFalse(four);
       assertFalse(five);
       assertFalse(twenth);
       assertFalse(twentOne);
    }    
    @Test
    public void findRoot(){
        
    }
}
