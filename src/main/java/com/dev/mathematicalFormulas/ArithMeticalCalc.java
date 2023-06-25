package com.dev.mathematicalFormulas;

import java.util.List;

public class ArithmeticalCalc {

    public static Double sum(Double i, Double j) {
        return i+j;
    }

    public static Double sub(Double i, Double j) {
        return i-j;
    }

    public static Double mult(Double i, Double j) {
        return i*j;
    }

    public static Double div(Double i, Double j) {
        return i/j;
    }

    public static Double avg(List<Double> numbers) {
        Double acumulator = 0.0;
        for(Double number:numbers){
            acumulator+=number;
        }
        return acumulator/numbers.size();
    }

    public static boolean isPrime(int d) {
        if(d == 0) return false;
        for(int i = 1; i <= d;i++){
            if((d%i == 0)  && (i!= 1) && (i!=d)) return false;
        }
        return true;
    }
}
