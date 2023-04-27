package com.company;

import java.util.Scanner;

public class TaskSixOne{
    public static void main(String[] args){
        String employeeName1 = "Sara Magura", employeeName2 = "Marek Janczyk", employeeName3 = "Julia Rak";
        int employeeIdNumber1 = 47899, employeeIdNumber2 = 39119, employeeIdNumber3 = 81774;
        String employeeDepartment1 = "Rachunkowość", employeeDepartment2 = "Informatyka", employeeDepartment3 = "Produkcja";
        String employeePosition1 = "Wiceprezes", employeePosition2 = "Programista", employeePosition3 = "Inżynier";

        Employee employee1 = new Employee(employeeName1, employeeIdNumber1, employeeDepartment1, employeePosition1);
        Employee employee2 = new Employee(employeeName2, employeeIdNumber2, employeeDepartment2, employeePosition2);
        Employee employee3 = new Employee(employeeName3, employeeIdNumber3, employeeDepartment3, employeePosition3);

        System.out.println("Dane pracowników:");
        System.out.println("Imię i nazwisko" + "\t" + "Identyfikator" + "\t"  + "Dział" + "\t" + "Stanowisko");
        System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t" + employee1.getDepartment()
                + "\t" + employee1.getPosition());
        System.out.println(employee2.getName() + "\t" + employee2.getIdNumber() + "\t" + employee2.getDepartment()
                + "\t" + employee2.getPosition());
        System.out.println(employee3.getName() + "\t" + employee3.getIdNumber() + "\t" + employee3.getDepartment()
                + "\t" + employee3.getPosition());
    }
}
