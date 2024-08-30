package com.company.TasksSeven;

import java.io.IOException;
import java.util.Scanner;

public class TaskSevenThreeAndFour {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wpisz numer rachunku bankowego");
        String account = keyboard.next();
        BankAccount bankAccount = new BankAccount(account);
        if(!bankAccount.checkAccount()){
            System.out.println("Niepoprawny rachunek bankowy ");
        }
        else {
            System.out.println("Podano poprawny rachunek bankowy");
        }
    }
}
