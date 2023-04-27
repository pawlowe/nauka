package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskSIXThirteen {
public static void main(String[] args) throws FileNotFoundException {
    String deposits = "C:\\Users\\...\\...\\...\\...\\Deposits.txt";
    String withdrawals = "C:\\Users\\...\\...\\...\\...\\Withdrawals.txt";

    SavingsAccount savingsAccount = new SavingsAccount(500, 9);

    File fileDeposits = new File(deposits);

    if (!fileDeposits.exists()) {
        System.out.println("Nie znaleziono pliku o nazwie z wpłatami");
        System.exit(0);
    }
    else {
        Scanner inputFile = new Scanner(fileDeposits);

        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            savingsAccount.deposit(line);
        }
        inputFile.close();
    }

    File fileWithdrawals = new File(withdrawals);

    if (!fileWithdrawals.exists()) {
        System.out.println("Nie znaleziono pliku o nazwie z wypłatami");
        System.exit(0);
    }
    else {
        Scanner inputFile = new Scanner(fileWithdrawals);

        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            savingsAccount.withdraw(line);
        }
        inputFile.close();
    }

   savingsAccount.interest(1);

    System.out.printf("Salkdo końcowe wynosi %.2f",savingsAccount.getDepositBalance());

    }
}
