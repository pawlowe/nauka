package com.company;

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int year, String type){
        yearModel = year;
        make = type;
        speed = 0;
    }

    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public int accelerate(int currentSpeed) {
        int value = currentSpeed + 5;
        return value;
    }

    public int brake(int velocity){
        int newValue = velocity;
        return newValue;
    }
}
