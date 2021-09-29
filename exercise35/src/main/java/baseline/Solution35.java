/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
*Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.
*
*Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
 */
public class Solution35 {
    //initialize scanner and Solution35 caller
    private static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static final Solution35 sol = new Solution35();

    public static void main (String [] args){
        //create an array to store all the names that will be entered
        ArrayList<String> names = new ArrayList<String>();
        String input;
        //prompt user to enter a name
        //loop it and scan the value, storing it in an array until the user enters no input
        do {
            System.out.print("Enter a name: ");
            input = scanner.nextLine();
            names.add(input);
        } while (!input.isEmpty());
        names.remove(names.size() - 1);
        //call the randomizer
        sol.randomizer(names);
    }

    //pass in the names that were entered
    void randomizer(ArrayList names){
        //randomly choose a name at random
        String result = (String) names.get(random.nextInt(names.size()));
        //print out who the winner is
        System.out.println("The winner is... " + result + ".");
    }
}
