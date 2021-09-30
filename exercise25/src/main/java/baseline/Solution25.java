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
    //initialize instance of class, so you can call the passwordValidator function later
    public static final  Solution25 sol = new Solution25();

    public static void main (String [] args){
        //Prompt user for password
        System.out.print("Enter your password to determine its strength: ");
        //use scanner to store password
        String pass = scanner.nextLine();

        //pass password into passwordValidator function
        String result = sol.passwordValidator(pass);
        System.out.print("The password '"+ pass + result);

    }

    public String passwordValidator(String password){
        String statement;
        //create an int to keep track of the number of characters the password contains
        int num = password.length();
        //create booleans that will determine which is statement the password will go into
        boolean isLetter = false, isDigit = false, isSpecial = false;
        //used to find special characters in the password
        Set<Character> set = new HashSet<>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        //test to see if the password has letters or numbers
        for(char i: password.toCharArray()){
            //if the character is a letter then set the letter bool to true
            if(Character.isLetter(i)){
                isLetter = true;
            }
           //if the character is a digit then set the digit bool to true
            if(Character.isDigit(i)){
                isDigit = true;
            }
           //if the character is a special character that is in the set, set special bool to true
            if (set.contains(i))
                isSpecial = true;
        }

        //test to see if the password is only digits and < 8 characters
        if ((num >= 8) && isDigit && isLetter && isSpecial){
            //say it's a very strong password
            statement = "' is a very strong password.";
        }
        //test to see if the password is only letters and < 8 characters
        else if ((num < 8) && isLetter){
            //say it is a weak password
            statement = "' is a weak password.";
        }
        //test to see if the password has at least one number and letter and 8 characters
        else if ((num >= 8) && isDigit && isLetter) {
            //say it is a strong password
            statement= "' is a strong password.";
        }
        //test to see if it has letters, numbers, special characters and >= 8 characters
        else if ((num < 8) && (isDigit)){
            //say it is a very weak password
            statement = "' is a very weak password.";
        }
        // if none of these apply then print out that the password is of unknown strength
        else {
            statement = "' is a password of unknown strength.";
        }

        return statement;
    }
}
