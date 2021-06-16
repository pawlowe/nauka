package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] firstTable = {'a','e','i','o','u'};
        String[] secondTable = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","w","z","x","y"};
        String[] thirdTable = {"1","2","3","4","5","6","7","8","9","0"};

        StringBuffer sam = new StringBuffer();
        StringBuffer spl = new StringBuffer();
        StringBuffer lic = new StringBuffer();
        StringBuffer inn = new StringBuffer();

        //create word
        String word;
        word = JOptionPane.showInputDialog("Podaj wyraz:");
        System.out.println(word);

        System.exit(0);
        //change string to char table


        /*char[] wordTable = word.toCharArray();
        System.out.println("this is word table " + wordTable);*/

        /*for(int i=0; i <= word.length(); i++) {
            if (word.valueOf(i).equals (firstTable[i]))
            {
                sam.append(word.valueOf(i));
            }
        }*/
    }
}

