package com.company.TasksSix;

import com.company.TasksSix.SavingsAccount;

import java.util.Scanner;

public class TaskSixTwelve {
    public static void main(String[] args){
        double percent, depositAmount = 0.0, withdrawAmount = 0.0, interestAmount = 0.0;
        double balance;
        int months;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj roczną stopę procentową:");
        percent = keyboard.nextInt();
        System.out.println("Podaj początkowy stan konta:");
        balance = keyboard.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(balance, percent);

        System.out.println("Podaj liczbe miesięcy jaka upłyneła od założenia konta:");
        months = keyboard.nextInt();

        for(int i =1; i <= months; i++){

            System.out.println("Podaj jaką kwotę wpłaciłeś na rachunek w danym miesięcu");
            depositAmount += savingsAccount.deposit(keyboard.nextDouble());
            System.out.println("Podaj jaką kwotę wypłaciłeś z rachunku w danym miesięcu");
            withdrawAmount += savingsAccount.withdraw(keyboard.nextDouble());
            interestAmount += savingsAccount.interest(months);

            System.out.println(savingsAccount.getDepositBalance());
            System.out.println(depositAmount);
            System.out.println(withdrawAmount);
            System.out.println(interestAmount);
        }

        System.out.println("Łączna ilość zdeponowanych pieniędzy: " + depositAmount);
        System.out.println("Łączna ilość wypłaconych pieniędzy: " + withdrawAmount);
        System.out.println("Łączna ilość odsetek: " + interestAmount);
        System.out.println("Stan końcowy konta: " + savingsAccount.getDepositBalance());
    }
}
