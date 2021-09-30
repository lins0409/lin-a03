/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.*;

/*
 *Given the following data set create a program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.
 */
public class Solution40 {
    //initialize scanner to be used for when the value is going to be read in
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        //create a list that will hold all the employee information that will be stored in array form
        List<Employees> list = new ArrayList<>();
        //store all the values listed in the chart, like Solution39
        list.add(new Employees("John", "Johnson", "Manager", "2016-12-31"));
        list.add(new Employees("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.add(new Employees("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        list.add(new Employees("Jake", "Jacobson", "Programmer", " "));
        list.add(new Employees("Jacquelyn", "Jackson", "DBA", " "));
        list.add(new Employees("Sally", "Webber", "Web Developer", "2015-12-18"));

        //compare all the last names to each other so the list is organized by last name
        list.sort(new nameFinder() {
            @Override
            public int compare(Employees employeeOne, Employees employeeTwo) {
                return super.compare(employeeOne, employeeTwo);
            }
        });

        //prompt user for a search string
        System.out.print("Enter a search string: ");
        //store the value to be compared
        String search = scanner.nextLine();

        //printout the formatted list
        System.out.print("\nResults:\n\n");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        //loop so that if the string read in is found to match even a little part of the first or last name of the employee then it will print it out
        for(Employees employed: list){
            if(employed.firstName.contains(search) || employed.lastName.contains(search)) {
                System.out.format("%-9s %-10s| %-18s| %s\n", employed.firstName, employed.lastName, employed.position, employed.separationDate);
            }
        }
    }
}
