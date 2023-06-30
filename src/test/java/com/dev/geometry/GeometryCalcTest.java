package com.dev.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeometryCalcTest {
    
    @Test
    public void circlePerimeterByRadius(){
        Double perimeter = GeometryCalc.circlePerimeter(1.0);
        assertEquals((Double)6.283185307179586, perimeter);
    }
    @Test
    public void circleAreaByRadius(){
        Double area = GeometryCalc.circleArea(2.0);
        assertEquals((Double)12.566370614359172, area);
    }
    
}