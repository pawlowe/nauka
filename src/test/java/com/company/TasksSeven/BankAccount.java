package com.company.TasksSeven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankAccount{
    private String userAccount;
    private String fileName = "C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenFour.txt";
//    private String[] accounts = {"5658845", "4520125", "7895122", "8777541", "8451277", "1302850",
//                                "8080152", "4562555", "5552012", "5050552", "7825877", "1250255",
//                                "1005231", "6545231", "3852085", "7881200", "4581002"};
    private File file;
    private Scanner bankFile;

    public BankAccount(String account) throws FileNotFoundException {
        userAccount = account;
        this.file = new File(fileName);
        this.bankFile = new Scanner(this.file);
    }

    public String getUserAccount(){
        return userAccount;
    }

    public boolean checkAccount(){
        boolean founded = false;
        do {
            String line = this.bankFile.nextLine();
            if (getUserAccount().equalsIgnoreCase(line)){
                founded = true;
                break;
            }
        }while (this.bankFile.hasNext());
        this.bankFile.close();
        return founded;
    }
}
