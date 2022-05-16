package com.company;

public class TaskFiveFive {
    public static void main(String[] args)
    {
        double distance;

       for (int i =1; i<=10; i++)
       {
          distance = fallingDistance(i);

          System.out.printf("W czasie %s s. Obiekt przebył odległość %.2f m. \n ", i, distance);
       }
    }

    /**
     * Obliczanie przebytej odległości podczas spadania
     * @param time - ilość sekund
     * @return distanceV - odległość jaką przebył obiekt
     */

    public static double fallingDistance(int time)
    {
       final double g = 9.8;
       double distanceV = 0.5 * g * (time * time);
       return  distanceV;
    }
}
