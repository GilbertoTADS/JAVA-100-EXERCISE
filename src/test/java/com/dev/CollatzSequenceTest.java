package com.dev;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class CollatzSequenceTest {
    
    @Test
    public void collatzSequence(){
        List<Double> results = new CollatzCalc().run(6.0);
        assertEquals((Double)6.0, results.get(0));
        assertEquals((Double)3.0, results.get(1));
        assertEquals((Double)10.0, results.get(2));
        assertEquals((Double)5.0, results.get(3));
        assertEquals((Double)16.0, results.get(4));
        assertEquals((Double)8.0, results.get(5));
        assertEquals((Double)4.0, results.get(6));
        assertEquals((Double)2.0, results.get(7));
        assertEquals((Double)1.0, results.get(8));
    }
}
