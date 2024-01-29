package com.company.TasksFour;

import java.util.Scanner;

public class TaskFourFive {
    public static void main(String[] args) {
        String word, character;
        char wordCharacter;
        int value = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dowolny ciąg znaków: ");
        word = keyboard.next();

        System.out.println("Podaj znak który chcesz zliczyć: ");
        character = keyboard.next();
        char singleCharacter = character.charAt(0);

        for (int i = 0; i < word.length(); i++) {
            wordCharacter = word.charAt(i);
            if (wordCharacter == singleCharacter) {
                value += 1;
            }
        }
        System.out.println("Twój znak występuje " + value + " razy w podanym ciągu znaków.");
    }
}

