package com.company.TasksThree;

import java.util.Scanner;

public class TaskThreeEighteen {
    public static void main(String[] args) {
        String vegetarian, vegan, glutenFree;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej?");
        vegetarian = keyboard.next();

        System.out.println("Czy któraś z osób jest na diecie wegańskiej?");
        vegan = keyboard.next();

        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        glutenFree = keyboard.next();

        if (vegan.equalsIgnoreCase("tak"))
        {
            System.out.println("Mozecie wybrać się do następujących restauracji:" + '\n' + "Kawiarnia na Rogu" + '\n' +
                    "Kuchnia u Szefa");
        }
        else if (vegetarian.equalsIgnoreCase("tak") && vegan.equalsIgnoreCase("nie")
                && glutenFree.equalsIgnoreCase("nie"))
        {
            System.out.println("Mozecie wybrać się do następujących restauracji:" + '\n' + "Pizzeria przy Dworcowej" + '\n' +
                    "Kawiarnia na Rogu" + '\n' + "Włoskie specjały" + '\n' + "Kuchnia u Szefa");
        }
        else if (glutenFree.equalsIgnoreCase("tak"))
        {
            System.out.println("Mozecie wybrać się do następujących restauracji:" + '\n' + "Pizzeria przy Dworcowej" + '\n' +
                    "Kawiarnia na Rogu" + '\n' + "Kuchnia u Szefa");
        }
        else
        {
            System.out.println("Mozecie wybrać się do następujących restauracji:" + '\n' + "Luksusowe Burgery u Jarka" +
                    '\n' + "Pizzeria przy Dworcowej" + '\n' + "Kawiarnia na Rogu" + '\n' + "Włoskie specjały" + '\n' + "Kuchnia u Szefa");
        }
    }
}
