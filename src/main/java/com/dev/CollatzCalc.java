package com.dev;

import java.util.ArrayList;
import java.util.List;

import com.dev.mathematicalFormulas.ArithmeticalCalc;

public class CollatzCalc {
    private List<Double> results = new ArrayList<>();

    public List<Double> run(Double number) {
        results.add(number);

        if(number.equals((Double)1.0)) return this.results;

        return this.run(this.next(number));
    }
    private Double next(Double number){
        return ArithmeticalCalc.isPair(number) ? number/2 : (number*3)+1;
    }

}
