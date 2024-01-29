package com.company.TasksFour;

import java.util.Scanner;

public class TaskFourEight {
    public static void main(String[] args) {
        float yearsInput, monthInput, allMonth;
        float allInput = 0;
        float month1 = 0, month2 = 0, month3 = 0, month4 = 0, month5 = 0, month6 = 0, month7 = 0, month8 = 0,
                month9 = 0, month10 = 0, month11 = 0, month12 = 0;
        float avgMonth1, avgMonth2, avgMonth3, avgMonth4, avgMonth5, avgMonth6, avgMonth7, avgMonth8, avgMonth9,
                avgMonth10, avgMonth11, avgMonth12;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę lat z której chcesz zliczyć opady");
        yearsInput = keyboard.nextFloat();

        if (yearsInput < 1.0) {
            System.out.println("Liczba lat nie może być mniejsza niż 1");
        } else {
            for (int i = 1; i <= yearsInput; i++) {
                for (int m = 1; m <= 12; m++) {
                    System.out.println("Podaj liczbę opadów dla " + m + " miesiąca w cm.");
                    monthInput = keyboard.nextFloat();
                    if (monthInput < 0) {
                        System.out.println("Wartość opadów nie może być ujemna.");
                        monthInput = keyboard.nextFloat();
                    } else {
                        allInput += monthInput;
                        if (m == 1) {
                            month1 += monthInput;
                        }
                        if (m == 2) {
                            month2 += monthInput;
                        }
                        if (m == 3) {
                            month3 += monthInput;
                        }
                        if (m == 4) {
                            month4 += monthInput;
                        }
                        if (m == 5) {
                            month5 += monthInput;
                        }
                        if (m == 6) {
                            month6 += monthInput;
                        }
                        if (m == 7) {
                            month7 += monthInput;
                        }
                        if (m == 8) {
                            month8 += monthInput;
                        }
                        if (m == 9) {
                            month9 += monthInput;
                        }
                        if (m == 10) {
                            month10 += monthInput;
                        }
                        if (m == 11) {
                            month11 += monthInput;
                        } else {
                            month12 += monthInput;
                        }
                    }
                }
            }
        }
        allMonth = yearsInput * 12;
        avgMonth1 = month1 / yearsInput;
        avgMonth2 = month2 / yearsInput;
        avgMonth3 = month3 / yearsInput;
        avgMonth4 = month4 / yearsInput;
        avgMonth5 = month5 / yearsInput;
        avgMonth6 = month6 / yearsInput;
        avgMonth7 = month7 / yearsInput;
        avgMonth8 = month8 / yearsInput;
        avgMonth9 = month9 / yearsInput;
        avgMonth10 = month10 / yearsInput;
        avgMonth11 = month11 / yearsInput;
        avgMonth12 = month12 / yearsInput;

        System.out.println("Suma wszystkich miesięcy wynosi: " + allMonth);
        System.out.println("Suma opadów w cm wynosi: " + allInput);
        System.out.println("Wartość średnich opadów dla stycznia w tym okresie wynosi: " + avgMonth1);
        System.out.println("Wartość średnich opadów dla lutego w tym okresie wynosi: " + avgMonth2);
        System.out.println("Wartość średnich opadów dla marca w tym okresie wynosi: " + avgMonth3);
        System.out.println("Wartość średnich opadów dla kwietnia w tym okresie wynosi: " + avgMonth4);
        System.out.println("Wartość średnich opadów dla maj w tym okresie wynosi: " + avgMonth5);
        System.out.println("Wartość średnich opadów dla czerwca w tym okresie wynosi: " + avgMonth6);
        System.out.println("Wartość średnich opadów dla lipca w tym okresie wynosi: " + avgMonth7);
        System.out.println("Wartość średnich opadów dla sierpnia w tym okresie wynosi: " + avgMonth8);
        System.out.println("Wartość średnich opadów dla września w tym okresie wynosi: " + avgMonth9);
        System.out.println("Wartość średnich opadów dla października w tym okresie wynosi: " + avgMonth10);
        System.out.println("Wartość średnich opadów dla listopada w tym okresie wynosi: " + avgMonth11);
        System.out.println("Wartość średnich opadów dla grudnia w tym okresie wynosi: " + avgMonth12);
    }
}
