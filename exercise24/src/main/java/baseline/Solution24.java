/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;
import java.util.Arrays;
import java.util.Scanner;

//Create a program that compares two strings and determines if the two strings are anagrams.
public class Solution24 {
    //Initialize a scanner that will be used throughout the code
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        //Initialize function to call
        Solution24 sol = new Solution24();

        //Print out a statement asking for two strings for the program to determine if they are an anagram
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
        //prompt for the first string and store the value
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        //prompt for the second string and store the value
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        //create a boolean that will determine the print statement
        boolean status = sol.isAnagram(first, second);
        //make a char that will be used to hold the " character for printing purposes
        char quote = '"';

        //print out statements depending on if the status is true or false
        if (status){
            System.out.print(quote + first + quote + " and " + quote + second + quote + " are anagrams");
        }
        else {
            System.out.print(quote + first + quote + " and "+ quote + second + quote + " are not anagrams");
        }
    }

    //Anagram function- take in the two strings
    public boolean isAnagram(String one, String two){
        //create a boolean for later to print out the status
        boolean status;

        //first compare string lengths to see if the strings are even remotely similar
        if (one.length() == two.length()){
            //change the cases of the strings, so they can be compares
            char [] array1 = one.toLowerCase().toCharArray();
            char [] array2 = two.toLowerCase().toCharArray();

            //sort the arrays
            Arrays.sort(array1);
            Arrays.sort(array2);

            //compare the two arrays and change bool status
            status = Arrays.equals(array1, array2);

        }
        //implement an else that sets the bool to false if they are not the same length
        else {
            status = false;
        }
        return status;
    }
}