/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.util.Scanner;

/*
*Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:
*The first name must be filled in.
*The last name must be filled in.
*The first and last names must be at least two characters long.
*An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
*The ZIP code must be a number.
 */
public class Solution27 {
    //initialize scanner
    public static void main (String[] args){
        //first prompt for the first name
        //store the value in a string
        //prompt for the last name
        //store the value in a string
        //prompt for the employee ID
        //store the value
        //prompt for the zipcode
        //store the value
        //pass all the values into the validateInput function
    }
    void validateInput(){
        //check if firstName bool is true
        //check if lastName bool is true
        //check if employeeID bool is true
        //check if zipCode bool is true
        //if all of the values pass then print out that there were no errors found
    }
    //pass in the string for the first name
    boolean firstName(){
        //check if the length of the name is at least 2 letters
        //if not, print out that the name must be at least two letters
        //set the bool to false
        //if there is nothing there ( == 0), set the bool to false and say that it must be filled in
        //if yes, set the bool to true
            //print out the first name
        //return the bool
    }
    //pass in the last name string
    boolean lastName(){
        //check if the length of the last name is at least 2 letters
        //if not, print out that the name must be at least two letters
        //set the bool to false
        //if there is nothing there ( == 0), set the bool to false and say that it must be filled in
        //if yes, set the bool to true
            //print out the last name
        //return the bool
    }
    //pass in employeeID number
    boolean employeeID(){
        //check if the pattern of the employee id matches up
        //if it does not match up, then say that it must be formatted and set the bool to false
            //print out the employee id
        //return the bool
    }
    //pass in the zipcode
    boolean zipCode(){
        //check if the zipcode is 5 digits, if not then say that it must be 5 digits
        //set the bool to false
            //print out the zipcode
        //return the bool
    }
}
