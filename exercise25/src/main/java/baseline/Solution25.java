/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */
package baseline;

/*
*pseudocode
* Create a program that determines the complexity of a given password based on these rules:

-A very weak password contains only numbers and is fewer than eight characters.
-A weak password contains only letters and is fewer than eight characters.
-A strong password contains letters and at least one number and is at least eight characters.
-A very strong password contains letters, numbers, and special characters and is at least eight characters.
*
*   Initialize scanner to be used
*
*   Prompt user for password
*       -initialize instance of class, so you can call the passwordValidator function later
*       -use scanner to store password
*       -pass password into passwordValidator function
*
*   passwordValidator function
*       -tests the cases to see if the password is < 8 characters and only number
*           -if yes, print out it is a week password
*       -tests to see if the password is only letters and < 8 characters
*           -if yes, say it is a weak password
*       -test to see if the password has at least one number and 8 characters
*              -if yes, it is a strong password
*       -test to see if it has letters, numbers, special characters and >= 8 characters
*               -if yes, it's a very strong password
*       -if none of these apply then print out that the password is of unknown length
 */

public class Solution25 {
    public static void main (String [] args){

    }
}
