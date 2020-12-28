/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cut_the_check;

/**
 * CSC 206 
 * Mr.Osborne
 * @author Isaiah J Jones 
 * 2-6-2017
 */
import java.util.Scanner;

public class CUT_THE_CHECK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declare variables
        double totalCost, tipPercent;
        int partyPeople;

        //Create a new Scanner
        Scanner input = new Scanner(System.in);

        //Prompt User for the total cost of the meal
        //Store Users answer
        System.out.println("What is your total?");
        totalCost = input.nextDouble();

        //Prompt User for the tip percentage
        //Store Users answer
        System.out.println("What percent would you like to tip?");
        tipPercent = input.nextDouble();

        //Prompt User for the number of people who are paying
        //Store Users answer
        System.out.println("How many people are paying?");
        partyPeople = input.nextInt();

        //Print out the food bill
        System.out.println("Your food bill is:");
        System.out.println("$" + totalCost);
        System.out.println();

        //Print out the Tip
        System.out.println("Your your tip is:");
        System.out.println("$" + tipAmount(totalCost, realTip(tipPercent)));
        System.out.println();

        //Print out the Total
        System.out.println("Your total is:");
        System.out.println("$" + realTotal(totalCost, tipAmount(totalCost, realTip(tipPercent))));
        System.out.println();

        //Print out the how much each person needs to pay
        System.out.println("And each person needs to pay:");
        System.out.println("$" + dutch(realTotal(totalCost, tipAmount(totalCost, realTip(tipPercent))), partyPeople));
        System.out.println();
    }

    public static double realTip(double tipPercent) {
        double realTip = (tipPercent / 100);

        return realTip;
    }

    public static double tipAmount(double x, double y) {
        double tipAmount = (x * y);

        return tipAmount;
    }

    public static double realTotal(double totalCost, double tipAmount) {
        double realTotal = totalCost + tipAmount;

        return realTotal;
    }

    public static double dutch(double realTotal, int partyPeople) {
        double dutch = realTotal / partyPeople;

        return dutch;
    }

}
