package com.company.TasksSeven;

import java.util.Scanner;

public class Payroll {
    final int TABLE_SIZE = 7;
    private int[] hours, employeeId;
    private double[] payRate, wages;
    private int[] employee = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};

    Scanner keyboard = new Scanner(System.in);

    public Payroll(){
        employeeId = new int[TABLE_SIZE];
            for(int i = 0; i < employee.length; i++){
                employeeId[i] = employee[i];
            }
        hours = new int[TABLE_SIZE];
        payRate = new double[TABLE_SIZE];
        wages = new double[TABLE_SIZE];
    }

    public void setHours(int i){
        int hourValue;
        do{
            System.out.printf("Podaj liczbę godzin przepracowanych przez pracownika o ID %s ", getEmployeeId(i));
            hourValue = keyboard.nextInt();
            if(hourValue<0){
                System.out.println("Wprowadzono niepoprawną wartość. " +
                        "Liczba przepracowanych godzin nie może być mniejsza niż 0");
            }
        } while (hourValue<0);

        hours[i] = hourValue;
    }

    public void setPayRate(int i){
        double payRateValue;
        do{
            System.out.printf("Podaj stawkę godzinową danego pracownika %s pracownika ", getEmployeeId(i));
            payRateValue = keyboard.nextDouble();
            if(payRateValue<13.70){
                System.out.println("Wprowadzono niepoprawną wartość. " +
                        "Stawka godzinowa nie może być mniejsza niż 13,70.");
            }
        } while (payRateValue<13.70);
        payRate[i] = payRateValue;
    }

    public void setWages(int i){
        wages[i] = hours[i] * payRate[i];
    }

    public void setEmployeeValues(){
        for(int i=0; i<employeeId.length; i++){
            setHours(i);
            setPayRate(i);
            setWages(i);
        }
    }

    public int getEmployeeId(int i){
        return employeeId[i];
    }

    public double getEmployeeWages(int i){
        return wages[i];
    }

    public void showWagesByEmployee(){
        for(int i=0; i<employeeId.length; i++){
            System.out.printf("Pensja pracownika o nr ID %.2f wynosi %s. \n", getEmployeeId(i), getEmployeeWages(i));
        }
    }
}
