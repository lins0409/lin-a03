/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.util.Scanner;

/*
* The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking the number 72 and dividing it by the expected rate of return. It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you. It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero. And instead of exiting the program when the user enters invalid input, you can just keep prompting for inputs until you get one that’s valid.
*Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.
 */
public class Solution29 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        Solution29 sol = new Solution29();

        //prompt for the rate of return
        System.out.print("What is the rate of return? ");
        //if the value is non-numeric,  say that it is invalid and prompt again
        while(!scanner.hasNextInt()){
            System.out.print("Sorry. That's not a valid input.\n");
            scanner.next();
            sol.mainCaller();
        }
        int rate = scanner.nextInt();
        if ( rate == 0){
            System.out.print("Sorry. That's not a valid input.\n");
            //scanner.next();
            sol.mainCaller();
        }
        //if the value is good call the print function
        sol.printResults(rate);

    }
    //function to call main again for the loop
    void mainCaller (){
        main(null);
    }
    //print and calculate function
    //pass in the rate of return
    void printResults(int rate){
        //years = 72/ rate
        //int value = Integer.parseInt(rate);
        int years = 72/rate;
        //print out the results of the equation
        System.out.print("It will take "+ years +" years to double your initial investment.");
    }
}
