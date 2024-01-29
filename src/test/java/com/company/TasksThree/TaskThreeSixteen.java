package com.company.TasksThree;

import java.util.Scanner;

public class TaskThreeSixteen {
    public static void main(String[] args){
        int booksValue, points;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość zakupionych książek w tym miesiącu:");
        booksValue = keyboard.nextInt();

        switch (booksValue){
            case 0:
                System.out.println("Niestety w tym miesiącu jeszcze nie uzyskałeś żadnych punktów");
                break;
            case 1:
                points = 5;
                System.out.println("W tym miesiącu uzyskałeś: " + points);
                break;
            case 2:
                points = 15;
                System.out.println("W tym miesiącu uzyskałeś: " + points);
                break;
            case 3:
                points = 30;
                System.out.println("W tym miesiącu uzyskałeś: " + points);
                break;
            default:
                points = 60;
                System.out.println("W tym miesiącu uzyskałeś: " + points);
        }
    }
}
