package com.company.TasksSix;

public class Circle {
    private double radius;
    private final double PI = 3.12159;
    private double area;
    private double diameter;
    private double circumference;

    public Circle(String rad){
        radius = Double.parseDouble(rad);
    }

    public Circle(){
        radius = 0.0;
    }

    public void setRadius(String rad){
        radius = Double.parseDouble(rad);
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        area = PI * getRadius() * getRadius();
        return area;
    }

    public double getDiameter(){
        diameter = getRadius() * 2;
        return diameter;
    }

    public double getCircumference(){
        circumference = 2 * PI * getRadius();
        return circumference;
    }
}
