package com.company.TasksSix;

import com.company.TasksSix.Payroll;

import java.util.Scanner;

public class TaskSixFive {
    public static void main(String[] args){

        Payroll payroll = new Payroll();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj imię pracownika");
        payroll.setName(keyboard.next());

        System.out.println("Wprowadź nazwisko pracownika: ");
        payroll.setSurname(keyboard.next());

        System.out.println("Podaj nr ID pracownika:");
        payroll.setId(keyboard.nextInt());

        System.out.println("Wprowadź ilość przepracowanych w miesiącu godzin:");
        payroll.setHours(keyboard.nextInt());

        System.out.println("Wprowadź stawkę godzinową pracownika:");
        payroll.setWages(keyboard.nextDouble());
        payroll.setSalary();

        System.out.println("Pracownik: " + payroll.getName() + " " + payroll.getSurname());
        System.out.println("O numerze ID: " + payroll.getId());
        System.out.println("Zarobi brutto: " + payroll.getSalary());
    }
}
