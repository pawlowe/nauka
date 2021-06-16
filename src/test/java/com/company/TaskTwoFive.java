package com.company;

public class TaskTwoFive {
    public static void main(String[] args){
        double rate = 0.62;
        double sales = 4.6;
        double regionSales = sales * rate;

        System.out.println("Sprzedaż dla regionu mazowieckiego wyniesie " + regionSales
                + " mln złotych");
    }
}
