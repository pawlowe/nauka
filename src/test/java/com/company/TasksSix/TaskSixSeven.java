package com.company.TasksSix;

import com.company.TasksSix.Circle;

import java.util.Scanner;

public class TaskSixSeven {
    public static void main(String[] args){
        Circle circle = new Circle();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź promień koła: ");
        circle.setRadius(keyboard.next());

        System.out.println("Powierzchnia koła wynosi: " + circle.getArea());
        System.out.println("Srednica koła wynosi: " + circle.getDiameter());
        System.out.println("Obwód koła wynosi: " + circle.getCircumference());
    }
}
