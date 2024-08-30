package com.company.TasksSeven;

public class TaskSevenEleven {
    public static void main(String[] args){

        int[] number = { 2, 4, 6, 8, 13, 15, 18, 32, 27, 45,
                        39, 21, 37, 12, 28, 36, 44, 49, 26, 17};

        Table table = new Table();

        System.out.println("Suma liczb z tabeli wynosi: " + table.getTotal(number));
        System.out.println("Średnia liczb z tabeli wynosi: " + table.getAverage(number));
        System.out.println("Największa liczba z tabeli wynosi: " + table.getHighest(number));
        System.out.println("Najmniejsza liczba z tabeli wynosi: " + table.getLowest(number));
    }
}
