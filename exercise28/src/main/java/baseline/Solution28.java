/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.util.Scanner;

/*
*In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.
*Write a program that prompts the user for five numbers and computes the total of the numbers.
 */
public class Solution28 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);
    int tempSum;

    public static void main (String[] args){
        Solution28 sol = new Solution28();
        //make an int total
        int total = 0, i;
        //create a for loop that will repeat and ask for the value
        for (i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            //add the total each time it goes through the loop
            int value = scanner.nextInt();
            total = sol.totalReturn(value);
        }
        //call method that will print out the solution
        sol.printResults(total);
    }

    int totalReturn(int input){
        int sum = 0;

        sum += input;
        tempSum += sum;

        return tempSum;
    }
    //pass in the total
    void printResults(int total){
        //print out the solution
        System.out.print("The total is " + total + ".");
    }
}
