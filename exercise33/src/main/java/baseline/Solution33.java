/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.Scanner;
import java.util.Random;

/*
*Arrays are great for storing possible responses from a program. If you combine that with a random number generator, you can pick a random entry from this list, which works great for games.
*
*Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."
 */
public class Solution33 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution33 sol = new Solution33();

    public static void main (String[] args){
        //prompt for the question
        System.out.print("What's your question? \n");
        System.out.print("> ");
        //scan for the input
        String input = scanner.next();

        Random random = new Random();
        //generate a random number
        int randomNumber = random.nextInt(input.length());
        //run the random response function
        sol.randomResponse(randomNumber);
    }

    //function that generates a response for the user
    void randomResponse(int randomNumber){
        //create an array of responses
        String[] responses = {"Yes","No","Maybe","Ask again later."};
        //print out the response
        String output = responses[randomNumber];

        System.out.println();
        System.out.println(output);
    }
}
