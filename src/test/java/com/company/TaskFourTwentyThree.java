package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class TaskFourTwentyThree {
    public static void main(String[] args) throws Exception{
        String inputName, inputDescription, user;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        inputName = keyboard.nextLine();
        System.out.println("Opisz siebie");
        inputDescription = keyboard.nextLine();
        System.out.println("Podaj usera");
        user = keyboard.nextLine();

        String path = "C:\\Users\\"+user+"\\Desktop\\Documenty\\Java\\";

        PrintWriter outputFile = new PrintWriter(path+inputName+"_html.txt");
        outputFile.println("<html>");
        outputFile.println("<head>");
        outputFile.println("<body>");
        outputFile.println("\t" + "<center>");
        outputFile.println("\t" + "\t" + "<h1>" + inputName + "</h1>");
        outputFile.println("\t" + "</center>");
        outputFile.println("\t" + "<hr />");
        outputFile.println("\t" + inputDescription);
        outputFile.println("\t" + "<hr />");
        outputFile.println("</body>");
        outputFile.println("</html>");
        outputFile.close();
    }
}
