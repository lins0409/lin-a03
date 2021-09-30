package baseline;

import java.util.Comparator;
import java.util.Map;

//to make the list of employees like Solution 39
public class Employees {

    //declare strings for the first name, last name, position, and separation date
    public String firstName, lastName, position, separationDate;

    //create a constructor to store all the employee information
    public Employees(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
}

//create the comparator to be used in main
abstract class nameFinder implements Comparator<Employees>{
    Map<Integer, Employees> base;
    public int compare(Employees employeeOne, Employees employeeTwo) {
        return employeeOne.lastName.compareTo(employeeTwo.lastName);
    }
}
