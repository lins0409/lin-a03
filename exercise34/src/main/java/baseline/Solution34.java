/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/*
*Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.
*
*Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.
 */

public class Solution34 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution34 sol = new Solution34();

    public static void main (String[] args){
        //print out that there are however many employees
        int employee = 5;
        System.out.print("There are " + employee +" employees: \n");
        //create an array to store the employees
        String[] names =new String[] {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        //print out the names in the array
        Arrays.stream(names).forEach(System.out::println);
        //prompt user for the name they want to delete from the array
        System.out.print("Enter an employee name to remove: ");
        //scan in the value and store it
        String delete = scanner.nextLine();
        //call the delete function
        sol.removeEmployee(list, delete);
        //update the array to no longer have that employee
        names = list.toArray(new String[0]);
        //decrease employee count by one
        employee--;
        //print out the list afterwards and the number of employees there are
        System.out.print("There are " + employee +" employees: \n");
        Arrays.stream(names).forEach(System.out::println);
    }

    //delete function
    void removeEmployee(List list, String delete){
        //delete the employee name that was passed in
        list.remove(delete);
    }
}
