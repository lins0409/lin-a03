package baseline;

import java.util.Comparator;

public class Employees {
    public String firstName, lastName, position, separationDate;

    //create a constructor to store all the employee information
    public Employees(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

}
//comparator
abstract class lastNameSorter implements Comparator<Employees>{
    public int compare(Employees employeeOne, Employees employeeTwo) {
        return employeeOne.lastName.compareTo(employeeTwo.lastName);
    }
}