/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.
 */
public class Solution40 {
    //initialize scanner to be used for when the value is going to be read in
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        //create a list that will hold all the employee information that will be stored in array form
        List <Employees> list = new ArrayList<>();
        //store all the values listed in the chart, like Solution39
        //prompt user for a search string
        //store the value to be compared
        //loop so that if the string read in is found to match even a little part of the first or last name of the employee then it will print it out
        //printout the formatted list
        System.out.print("Results:\n\n");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
    }


}
