package com.company;

import java.util.Scanner;

public class TaskFourSixteen {
    public static void main(String[] args){
        int budget, expenditure, difference;
        int outgoings = 0 ;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wielkość miesięcznego budżetu w pełnych złotych");
        budget = keyboard.nextInt();
        System.out.println("Podaj wydatek w pełnych złotych");
        expenditure = keyboard.nextInt();

        while(expenditure != 0){
            outgoings += expenditure;

            System.out.println("Wprowadź kolejny wydate, lub 0 jeśli chcesz zakończyć wpisywanie danych");
            expenditure = keyboard.nextInt();
        }

        if (outgoings > budget){
            difference = outgoings - budget;
            System.out.println("Niestety nie masz tyle pieniędzy aby pokryć wszystkie wydatki");
            System.out.println("Budżet wynosi: " + budget);
            System.out.println("Wydatki wynoszą: " + outgoings);
            System.out.println("Brakuje Ci: " + difference);
        }
        else if (outgoings == budget){
            System.out.println("W tym miesięcu wydasz wszystkie pieniądze. Nie uda Ci się nic odłożyć");
            System.out.println("Budżet wynosi: " + budget);
            System.out.println("Wydatki wynoszą: " + outgoings);
        }
        else{
            difference = budget - outgoings;
            System.out.println("W tym miesiącu wystarczy czy na wszystkie opłaty i nawet coś odłożysz.");
            System.out.println("Budżet wynosi: " + budget);
            System.out.println("Wydatki wynoszą: " + outgoings);
            System.out.println("Oszczędności: " + difference);
        }
        System.exit(0);
    }
}
