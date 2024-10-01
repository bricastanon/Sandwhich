package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class Main {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        //Declaring the variables to store sandwhich prices
        double regularprice = 5.45;
        double largeprice = 8.95;
        double loadedRegularcost = 1.00;
        double loadedLargecost = 1.75;
        double totalCost = 0.0;

        //Prompt the user for sandwhich size
        System.out.println("Choose the sandwhich size");
        System.out.println("1: Regular Price ($5.45");
        System.out.println("2: Large Price ($8.95");
        int sizeChoice = reader.nextInt();

        if(sizeChoice == 1) {
            totalCost = regularprice;
        } else if(sizeChoice ==2) {
            totalCost = largeprice;
        } else
        {
            System.out.println("Pick a number between 1 and 2");
            reader.close();
            return;
        }
       // Prompt the user if they want the sandwhich loaded
        System.out.println("Would you like the sandwhich loaded? yes/no");
        reader.nextLine(); // Delete the unnecessary ENTER
        String isLoaded = reader.nextLine();
        if(isLoaded.equals("yes"))
        {
            totalCost = totalCost + loadedLargecost;
        }
        else if (isLoaded.equals("no")) {
            totalCost = totalCost = loadedRegularcost;
        }

 // EXAMPLE
        // String moneyEarned = (money < 1000) ? "I want to earn more" : "It's going well";
        // Float basePrice = (size <= 2) ? 5.45f : 8.95f;
        // ^^ (or) float basePrice = (size == 1) ? 5.45f : 8.95f
    }
}