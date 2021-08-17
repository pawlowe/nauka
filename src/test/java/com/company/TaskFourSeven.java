package com.company;

import io.cucumber.java.sl.In;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TaskFourSeven {
    public static void main(String[] args){
        int roomsSum = 0, roomsFree = 0, roomsOccupated = 0, floorsNumber, inputRooms, inputRoomsOccupated;
        float occupancyLevel;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilość pięter w hotelu");
        floorsNumber = keyboard.nextInt();

        if (floorsNumber <1) {
            System.out.println("Liczba pięter nie może być mniejsza niż 1");
        }
        else{
           for (int i = 1; i<=floorsNumber; i++ ){
                System.out.println("Podaj liczbę pokoi na danym piętrze");
                inputRooms = keyboard.nextInt();
                 while (inputRooms <10){
                     System.out.println("Liczba pokoi nie może być mniejsza niż 10");
                     System.out.println("Podaj liczbę pokoi na danym piętrze");
                     inputRooms = keyboard.nextInt();
                 }

                 roomsSum = roomsSum + inputRooms;

                System.out.println("Podaj liczbę zajętych pokoi na danym piętrze");
                inputRoomsOccupated = keyboard.nextInt();
                roomsOccupated = roomsOccupated + inputRoomsOccupated;
           }
        }

        occupancyLevel = (float)roomsOccupated/roomsSum;
        roomsFree = roomsSum - roomsOccupated;

        System.out.println("Całkowita liczba pokoi w hotelu: " + roomsSum);
        System.out.println("Ilość wolnych pokoi w hotelu: " + roomsFree);
        System.out.println("Ilość zajętych pokoi: " + roomsOccupated);
        System.out.println("Poziom obłożenia w hotelu wynosi: " + occupancyLevel);

        System.exit(0);
    }
}
