package com.dev.mathematicalFormulas;

public enum IMCenum {
    THINESS(1,"bellow 18.5"),
    NORMAL(2,"between 18.5 and 24.9"),
    OVERWEIGHT(3,"between 25 and 29.9"),
    OBESITY(4,"between 30 and 39.9"),
    SERIOUS_OBESITY(5,"above 40"),
    NOT_MATCHED(6,"ERROR - execute get method");
    
    private int cod = 6;
    private String descrition;

    IMCenum(int cod,String description){
        this.cod = cod;
        this.descrition = description;
    }
    
    public static IMCenum get(double imc){
        if(imc < 18.5 ) return THINESS;
        if(imc >= 18.5 && imc <= 24.9) return NORMAL;
        if(imc >= 25 && imc <= 29.9) return OVERWEIGHT;
        if(imc >= 30 && imc <= 39.9) return OBESITY;
        if(imc >= 40.0) return SERIOUS_OBESITY;
        return NOT_MATCHED;
    }
    public int getCod() {
        return cod;
    }
    public String getDescrition() {
        return descrition;
    }
}
