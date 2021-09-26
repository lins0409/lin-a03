/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
*pseudocode
* Create a program that determines the complexity of a given password based on these rules:
*
*A very weak password contains only numbers and is fewer than eight characters.
*A weak password contains only letters and is fewer than eight characters.
*A strong password contains letters and at least one number and is at least eight characters.
*A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
public class Solution25 {
    //Initialize scanner to be used
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String [] args){
        //initialize instance of class, so you can call the passwordValidator function later
        Solution25 sol = new Solution25();

        //Prompt user for password
        System.out.print("Enter your password to determine its strength: ");
        //use scanner to store password
        String pass = scanner.nextLine();

        //pass password into passwordValidator function
        sol.passwordValidator(pass);
    }

    void passwordValidator(String password){
        //create an int to keep track of the number of characters the password contains
        int num = password.length();
        //create booleans that will determine which is statement the password will go into
        boolean letter = false, digit = false, special = false;
        //used to find special characters in the password
        Set<Character> set = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        //test to see if the password has letters or numbers
        for(char i: password.toCharArray()){
            //if the character is a letter then set the letter bool to true
           if(Character.isLetter(i)){
               letter = true;
           }
           //if the character is a digit then set the digit bool to true
           if(Character.isDigit(i)){
               digit = true;
           }
           //if the character is a special character that is in the set, set special bool to true
            if (set.contains(i))
                special = true;
        }

        //print out the first half of the statement
        System.out.print("The password '"+ password);
        //test to see if the password is only digits and < 8 characters
        if ((num >= 8) && digit && letter && special){
            //say it's a very strong password
            System.out.print("' is a very strong password.");
        }
        //test to see if the password is only letters and < 8 characters
        else if ((num < 8) && letter){
            //say it is a weak password
            System.out.print("' is a weak password.");
        }
        //test to see if the password has at least one number and letter and 8 characters
        else if ((num >= 8) && digit && letter) {
            //say it is a strong password
            System.out.print("' is a strong password.");
        }
        //test to see if it has letters, numbers, special characters and >= 8 characters
        else if ((num < 8) && (digit)){
            //say it is a very weak password
            System.out.print("' is a very weak password.");
        }
        // if none of these apply then print out that the password is of unknown strength
        else {
            System.out.print("' is a password of unknown strength.");
        }
    }
}
