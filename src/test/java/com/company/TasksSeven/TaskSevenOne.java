package com.company.TasksSeven;

public class TaskSevenOne {

    public static void main(String[] args) {

        RainFall rainFall = new RainFall();

        rainFall.setRainFall();

        System.out.println("Roczna suma opadów wynosi: " + rainFall.getSumOfRainFall());
        System.out.printf("Średnia opadów wynosi: %.2f \n", rainFall.getAverageRainFallValue());
        System.out.printf("Miesiąc o maksymalnej ilości opadów: %d", rainFall.getTheMostRainingMonth());
        System.out.println("Miesiąc o minimalnej ilości opadów: " + rainFall.getTheMostDryMonth());
    }
}
