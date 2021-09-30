/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;

import java.util.Scanner;
/*
* pseudocode
* It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

*Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).
*
 */
public class Solution26 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        //First prompt the user for their balance
        System.out.print("What is your balance? ");
        //scan in the value and store in a variable
        double balance = scanner.nextDouble();
        //ask for what the apr is on the card as a percent
        System.out.print("What is the APR on the card (as a percent)? ");
        //store the value
        double APR = scanner.nextDouble();
        //changes the value into a percentage
        APR = APR/100;
        //ask what the monthly payment they can make is
        System.out.print("What is the monthly payment you can make? ");
        //store the value
        double payment = scanner.nextDouble();

        //set all the values read in to the constructor for the months until paid off function
        PaymentCalculator values = new PaymentCalculator(balance, APR, payment);
        //call paymentCalculator
        int months = values.calculateMonthsUntilPaidOff();

        //print out the results
        System.out.print("It will take " + months + " months to pay off this card.");
    }
}
