package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 14 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{

    public static void main( String[] args )
    {
        //define extra variables
        double tax = 0.055;
        double result;
        
            // scanner
            Scanner input = new Scanner(System.in);

            // get info
            System.out.print("What is the order amount? ");
            String strAmount = input.nextLine();
            System.out.print("What is the state? ");
            String strState = input.nextLine();

            //convert strings
            double numAmount = Double.parseDouble(strAmount);
            double roundAmmount = Math.round(numAmount * 100.00) / 100.00;

            //print subtotal
            System.out.print("The subtotal is $" + numAmount + ".\n");

            //if 'WI'
            if (strState.contains("WI")){
                result = Math.round((tax * numAmount) * 100.00) / 100.00;
                System.out.print("The tax is $" + result + ".\n");
            }

            //calculate final ammounts
            double total = (numAmount + (tax * numAmount));
            double finalAmmount = Math.round(total * 100.0) / 100.0;

        //print total
        System.out.print("The total is $" + finalAmmount + ".\n");

    }
}
