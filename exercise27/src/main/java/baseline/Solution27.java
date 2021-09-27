/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
*Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:
*The first name must be filled in.
*The last name must be filled in.
*The first and last names must be at least two characters long.
*An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
*The ZIP code must be a number.
 */
public class Solution27 {
    static String results = "";
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        Solution27 sol = new Solution27();
        //first prompt for the first name
        System.out.print("Enter the first name: ");
        //store the value in a string
        String firstName = scanner.nextLine();
        //prompt for the last name
        System.out.print("Enter the last name: ");
        //store the value in a string
        String lastName = scanner.nextLine();
        //prompt for the zipcode
        System.out.print("Enter the zipcode: ");
        //store the value
        String zip = scanner.nextLine();
        //prompt for the employee ID
        System.out.print("Enter the employee ID: ");
        //store the value
        String ID = scanner.nextLine();
        //pass all the values into the validateInput function
        sol.validateInput(firstName, lastName, zip, ID);
    }
    void validateInput(String first, String last, String zip, String ID){
        //check if firstName bool is true
        boolean firstName = firstName(first);
        //check if lastName bool is true
        boolean lastName = lastName(last);
        //check if zipCode bool is true
        boolean zipCode = zipCode(zip);
        //check if employeeID bool is true
        boolean employeeID = employeeID(ID);
        //if all the values pass then print out that there were no errors found
        if (firstName && lastName && zipCode && employeeID){
            results += "There were no errors found.\n";
        }
        System.out.print(results);
    }
    //pass in the string for the first name
    boolean firstName(String firstName){
        boolean status = true;
        //check if the length of the name is at least 2 letters
        if (firstName.length() < 2){
            //if not, print out that the name must be at least two letters
            results += "The first name must be at least 2 characters long.\n";
            //set the bool to false
            status = false;
        }
        //if there is nothing there ( == 0), set the bool to false and say that it must be filled in
        if (firstName.length() == 0){
            results += "The first name must be filled in.\n";
            status = false;
        }
        //return the bool
        return status;
    }
    //pass in the last name string
    boolean lastName(String last){
        boolean status = true;
        //check if the length of the last name is at least 2 letters
        if (last.length() < 2){
            //if not, print out that the name must be at least two letters
            results += "The last name must be at least 2 characters long.\n";
            //set the bool to false
            status = false;
        }
        //if there is nothing there ( == 0), set the bool to false and say that it must be filled in
        if (last.length() == 0){
            results += "The last name must be filled in.\n";
            status = false;
        }
        //return the bool
        return status;
    }
    //pass in the zipcode
    boolean zipCode(String zip){
        boolean status = true;
        //check if the zipcode is 5 digits, if not then say that it must be 5 digits
        //setting this as a try allows for me to double-check that the value entered were numbers and not letters
        try {
            int isNumber = Integer.parseInt(zip);
            if(zip.length() != 5){
                results += "The zipcode must be a 5 digit number.\n";
                //set the bool to false
                status = false;
            }
        } catch (NumberFormatException e){
            results += "The zipcode must be a 5 digit number.\n";
            //set the bool to false
            status = false;
        }

        //return the bool
        return status;
    }
    //pass in employeeID number
    boolean employeeID(String ID){
        boolean status = true;
        //set up a string to compare the ID string to
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        //check if the pattern of the employee id matches up
        if (!Pattern.matches(pattern, ID)){
            //if it does not match up, then say that it must be formatted and set the bool to false
            results += "The employee ID must be in the format of AA-1234.\n";
            status = false;
        }
        //return the bool
        return status;
    }
}
