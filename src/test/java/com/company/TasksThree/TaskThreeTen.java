package com.company.TasksThree;

import java.util.Scanner;

public class TaskThreeTen {
    public static void main(String[] args){
        float calories, grams, percent, fat;

        Scanner keybord = new Scanner(System.in);

        System.out.println("Podaj liczbę kalorii dla danego produktu:");
        calories = keybord.nextFloat();

        System.out.println("Podaj ile jest gramów tłuszczu w danym produkcie:");
        grams = keybord.nextFloat();

        fat = grams * 9;
        percent = (fat/calories) *10;
        System.out.println(percent);

        if (percent < 30)
        {
            System.out.printf("Ilość tłuszczu w danym produkcie wynosi:  " + percent + " ");
            System.out.println("Produkt jest niskotłuszczowy");
        }
        else if (percent >= 30 && percent <= 100)
        {
            System.out.printf("Ilość tłuszczu w danym produkcie wynosi: " + percent);
        }
        else
        {
            System.out.println("Dane wejsciowe są niepoprawne");
        }
    }
}
