package com.dev.mathematicalFormulas;

public class IMC {

    public static IMCenum calc(double kilo, double height) {
        double result = (kilo/(height*height));
        return IMCenum.get(result);
    }

}
