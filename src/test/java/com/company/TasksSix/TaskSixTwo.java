package com.company.TasksSix;

import com.company.TasksSix.Car;

public class TaskSixTwo {
    public static void main(String[] args){

        Car car = new Car(2022, "Renault");

        int value = car.getSpeed();

        for( int i=1; i<=5; i++){
            value += 5;
            System.out.println("Aktualna prędkość wynosi: " + value);
        }

        for( int i=1; i<=5; i++){
            value -= 5;
            System.out.println("Aktualna prędkość wynosi: " + value);
        }
    }
}
