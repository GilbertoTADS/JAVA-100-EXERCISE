package com.dev.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeometryCalcTest {
    
    @Test
    public void circlePerimeterByRadius(){
        Double perimeter = GeometryCalc.circlePerimeter(1.0);
        assertEquals((Double)6.28, perimeter);
    }
    
}
