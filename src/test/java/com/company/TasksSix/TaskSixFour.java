package com.company.TasksSix;

import com.company.TasksSix.RetailItem;

import java.util.Scanner;

public class TaskSixFour {
    public static void main(String[] args){
        String inputDescription1, inputDescription2, inputDescription3;
        int inputUnits1, inputUnits2, inputUnits3;
        double inputPrice1, inputPrice2, inputPrice3;

        RetailItem retailItem1 = new RetailItem();
        RetailItem retailItem2 = new RetailItem();
        RetailItem retailItem3 = new RetailItem();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj nazwę pierwszego produktu");
        inputDescription1 = keyboard.next();
        retailItem1.setDescription(inputDescription1);

        System.out.println("Podaj liczbę sztuk");
        inputUnits1 = keyboard.nextInt();
        retailItem1.setUnitsOnHand(inputUnits1);

        System.out.println("Podaj cenę produktu");
        inputPrice1 = keyboard.nextDouble();
        retailItem1.setPrice(inputPrice1);

        System.out.println("Podaj nazwę drugiego produktu");
        inputDescription2 = keyboard.next();
        retailItem2.setDescription(inputDescription2);

        System.out.println("Podaj liczbę sztuk");
        inputUnits2 = keyboard.nextInt();
        retailItem2.setUnitsOnHand(inputUnits2);

        System.out.println("Podaj cenę produktu");
        inputPrice2 = keyboard.nextDouble();
        retailItem2.setPrice(inputPrice2);

        System.out.println("Podaj nazwę trzeciego produktu");
        inputDescription3 = keyboard.next();
        retailItem3.setDescription(inputDescription3);

        System.out.println("Podaj liczbę sztuk");
        inputUnits3 = keyboard.nextInt();
        retailItem3.setUnitsOnHand(inputUnits3);

        System.out.println("Podaj cenę produktu");
        inputPrice3 = keyboard.nextDouble();
        retailItem3.setPrice(inputPrice3);

        System.out.println("Opis" + "\t" + "Liczba sztuk" + "\t"  + "Cena");
        System.out.println(retailItem1.getDescription() + "\t" + retailItem1.getUnitsOnHand() + "\t" + retailItem1.getPrice());
        System.out.println(retailItem2.getDescription() + "\t" + retailItem2.getUnitsOnHand()  + "\t" + retailItem2.getPrice());
        System.out.println(retailItem3.getDescription() + "\t" + retailItem3.getUnitsOnHand()  + "\t" + retailItem3.getPrice());
    }
}
