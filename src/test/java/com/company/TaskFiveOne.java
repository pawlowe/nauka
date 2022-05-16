package com.company;

import java.util.Scanner;

public class TaskFiveOne {
    public static void main(String[] args) {
        String input;
        int inputNumber;
        char character;

        input = getInput();
        inputNumber = getCharacter();

        character = showChar(input, inputNumber);

        System.out.println(character);
    }
    /**
     * Pobieranie wartości od użytkownika
     * @return Wartość wprowadzona przez użytkownika
     */

    public static String getInput()
    {
        String value;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź dowolny wyraz");
        value = keyboard.nextLine();

        return value;
    }

    /**
     * Metoda przekszłca wartość podaną przez użytkownika na liczbę
     * @return numer znaku jaki chcemy wyświetlić
     */

    public static int getCharacter()
    {
        int value;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź numer znaky który chcesz odczytać");
        value = keyboard.nextInt();

        return value;
    }

    /**
     * Metoda zwraca wartość jaka przypisana jest do danego znaku
     * @param value łańcuch znaków wprowadzony przez użytkownika
     * @param number numer znaku jaki chcemy wyświetlić
     * @return charValue wartość przypisana do danej pozycji
     */

    public static char showChar(String value, int number)
    {
        char charValue;

        charValue = value.charAt(number);

        return charValue;
    }
}



