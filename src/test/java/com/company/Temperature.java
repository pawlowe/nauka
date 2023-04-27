package com.company;

public class Temperature {
    private double fahrenheit;

    public Temperature(double ftemp){
        fahrenheit = ftemp;
    }

    public void setFahrenheit(double ftemp) {
        fahrenheit = ftemp;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }

    public double celsius(){
        double celsius = (5F / 9F) * (getFahrenheit() - 32);
        return celsius;
    }

    public double kelwin(){
        double kelwin = ((5F /9F) * (getFahrenheit() - 32)) + 273;
        return kelwin;
    }
}
