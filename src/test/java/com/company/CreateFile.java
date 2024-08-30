package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CreateFile{
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:\\Users\\Eliza\\Desktop\\pliki java\\TaskSevenFifteen.txt";

        PrintWriter outputFile = new PrintWriter(pathToFile);

        for(int i = 1; i <= 40; i++){
           int value = ThreadLocalRandom.current().nextInt(25000, 30000 + 1);
           outputFile.println(value);
        }
        
        outputFile.close();
    }
}
