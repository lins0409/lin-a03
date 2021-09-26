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

    public static void main (String[] args){
        //initialize and instance of Solution26
        //First prompt the user for their balance
        //scan in the value and store in a variable
        //ask for what the apr is on the card as a percent
        //store the value
        //ask what the monthly payment they can make is
        //store the value
        //call paymentCalculator
    }
}
//Payment calculator function
class PaymentCalculator{
    //take in APR, balance, and payment amount
    void calculateMonthsUntilPaidOff(){
        //create an int n for the result
        //divide APR by 365 and set to int i
        //calculate -(1/30) * log(1 + balance/payment * (1 - (1 + i)^30)) / log(1 + i)
    }
}
