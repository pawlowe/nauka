package com.company.TasksFive;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskFiveThirteen {
    public static void main(String[] args) throws IOException {
       int inputValue, message, value;

        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Podaj dowolną liczbę całkowitą");
        //inputValue = keyboard.nextInt();
        inputValue = 100;
        //message = isPrime(inputValue);
        for (int i=1; i<=inputValue; i++)
        {
            value = isPrime(i);
            addToTheFile(value, i);

            displayMessage(value, i);
        }
    }

    /**
     * Sprawdzanie czy liczba wprowadzona przez użytkownika jest liczbą pierwszą
     * @param value - wartość wprowadzona przez użytkownika
     * @return result - zwraca liczbę, dla liczby pierwszej result = 0, dla pozostałych liczb > 0
     */

    public static int isPrime (int value)
    {
        int result = 0;

        for(int i = 1; i <= value; i ++)
        {
            int quotient = value % i;
            if (quotient==0)
            {
                result += 1;
            }
        }
        return result;
    }

    /**
     * Wyświetla dane w zależności od wartości parametru message
     * @param message - jak wartość <=  2 to liczba jest liczbą pierwszą
     * @param inputValue - liczba wprowadzona przez użytkownika
     */

    public static void displayMessage(int message, int inputValue )
    {
        if(message<=2)
        {
            System.out.printf("Liczba %s jest liczbą pierwszą.\n", inputValue );
        }
        else
        {
            System.out.printf("Liczba %s nie jest liczbą pierwszą.\n", inputValue );
        }
    }

    /**
     * Metoda dodaje liczby pierwsze do pliku
     * @param prime - jak wartość <=  2 to liczba jest liczbą pierwszą
     * @param indicator - liczba
     */

    public static void addToTheFile(int prime, int indicator) throws IOException
    {

        FileWriter fwriter = new FileWriter("C:\\Users\\pawlowe1\\Desktop\\Documenty\\Java\\fiveFourteen.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        if(prime<=2)
        {
            outputFile.println(indicator);
            outputFile.close();
        }
    }
}
