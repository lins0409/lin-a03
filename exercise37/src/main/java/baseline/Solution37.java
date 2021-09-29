/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

/*
*Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.
 */
public class Solution37 {
    //initialize the scanner, Solution37, and Random
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution37 sol = new Solution37();
    public static final  Random random = new Random();

    public static void main (String[] args){
        //prompt the user for the minimum length, store the value
        System.out.print("What's the minimum length? ");
        int length = scanner.nextInt();
        //prompt for the number of special characters, store the value
        System.out.print("How many special characters? ");
        int numSpecial = scanner.nextInt();
        //prompt for the number of numbers, store the value
        System.out.print("How many numbers? ");
        int numNumbers = scanner.nextInt();

        //pass it into a random password generator
        sol.randomPasswordMaker(length, numSpecial, numNumbers);
    }
    //random password generator
    //pass in all the numbers for things
    void randomPasswordMaker(int length, int special, int num){
        //make a string for the letters, special characters, and numbers
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*";
        String numbers = "1234567890";
        //to store the password later for it to be printed out
        String password = "";

        //make an array to store the characters for the password
        ArrayList<Character> characters = new ArrayList<>();

        //use the numbers to generate a random string
        //for the number of special characters, generate random ones to be added to the array
        for(int i = 0; i < special; i++){
            // find random special Character and add it to the list
            characters.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }
        //for the number of numbers, generate a random number to be added to the array
        for(int i= 0; i < num; i++){
            // find random numeral and add it to the list
            characters.add(numbers.charAt(random.nextInt(numbers.length())));
        }
        //for the length generate a random character to be added to the array
        //place this at the end as it fills up the rest of the empty space in the string for the password
        for(int i = characters.size() - 1; i<length; i++){
            // find random letter and add it to the list
            characters.add(letters.charAt(random.nextInt(letters.length())));
        }

        //shuffle the array around so everything is random and not in order of the for loops
        Collections.shuffle(characters);

        //add all the characters that was just shuffled into the password string to be printed out
        for(Character s : characters)
        {
            password += Character.toString(s);
        }

        //print out the password
        System.out.print("Your password is " + password);
    }
}
