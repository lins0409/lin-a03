/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;

import java.util.List;
import java.util.ArrayList;

/*
*Given the following data set, create a program that sorts all employees by last name and prints them to the screen in a tabular format.
 */
public class Solution39 {

    public static void main (String[] args){
        //create a list that is equal to all the items in the employee array
        List<Employees> list = new ArrayList<>();
        //add the employees in individually since the values are set
        list.add(new Employees("John", "Johnson", "Manager", "2016-12-31"));
        list.add(new Employees("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        list.add(new Employees("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        list.add(new Employees("Jake", "Jacobson", "Programmer", " "));
        list.add(new Employees("Jacquelyn", "Jackson", "DBA", " "));
        list.add(new Employees("Sally", "Webber", "Web Developer", "2015-12-18"));

        //then compare the employee's last name using Comparator in a separate function, so they can be sorted
        list.sort(new lastNameSorter() {
            @Override
            public int compare(Employees employeeOne, Employees employeeTwo) {
                return super.compare(employeeOne, employeeTwo);
            }
        });

        //formatted print statement
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for(Employees employees: list){
            System.out.format("%-9s %-10s| %-18s| %s\n", employees.firstName, employees.lastName,  employees.position, employees.separationDate);
        }
    }
}

