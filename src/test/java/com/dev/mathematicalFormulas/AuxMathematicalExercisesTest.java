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
        double two = ArithmeticalCalc.root(2.0,4.0);
        double three = ArithmeticalCalc.root(2.0,9.0);
        double five = ArithmeticalCalc.root(2.0,25.0);
        double two2 = ArithmeticalCalc.root(3.0,8.0);
        assertTrue(two==2.0);
        assertTrue(three==3.0);
        assertTrue(five==5.0);
        assertTrue(two2==2.0);

    }
}
