package com.dev.mathematicalFormulas;

import java.util.ArrayList;
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

    public static Double root(double root, double number) {

        for(double i=1; i<=number;i++){
            double per = 1;
            for(double j=1;j<=root;j++){
             per *= i;
            }
            if(per == number){
                return i;
            }
            
        }
        return Double.NaN;
    }

    public static Double geoM(List<Double> numbers) {
        double result = 1.0;
        for(double number:numbers){
            double root = root(numbers.size(),number);
            if(Double.NaN == root) return Double.NaN;
            result *= root;
        }
        return result;
    }

    public static boolean isPair(double number) {
        return number%2 == 0;
    }
}
