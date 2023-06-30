package com.dev.geometry;

public class GeometryCalc {

    public static Double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static Double circleArea(double radius) {
        return (Math.PI*(radius*radius));
    }

    public static Double rectangleArea(double width, double height) {
        return height*width;
    }

    public static Double rectanglePerimeter(double width, int height) {
        return (2*(width+height));
    }

}
