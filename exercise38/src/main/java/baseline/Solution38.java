/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.Scanner;

/*
*Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing only the even numbers.
 */
public class Solution38 {
    //initialize the scanner
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution38 sol = new Solution38();

    public static void main (String[] args){
        //prompt the user for a list of numbers
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scanner.nextLine();
        //create an array to store the numbers
        //store the numbers in an array and split them via space
        String[] numbers = input.split(" ");
        //call the returnEven function
        Integer[] array = sol.filterEvenNumbers(numbers);

        //print out the even values in the new array
        System.out.print("The even numbers are " );
        for ( int i = 0; i < array.length; i++){
            if( i < array.length - 1){
                System.out.print(array[i] + " ");
            }
            else {
                System.out.print(array[i] + ".");
            }
        }
    }

    //only returns even numbers of the array
     public Integer[] filterEvenNumbers(String[] numbers){
        //create a new array for the even numbers only
        ArrayList<Integer> evens = new ArrayList<>();
        //loop for the number of elements in the array
        for (String number : numbers) {
            int num = Integer.parseInt(number);

            //divide them by 2
            if ((num % 2) == 0) {
                //add the results to the new array
                evens.add(num);
            }
        }
        //convert the list into an array for printing
        Integer[] array = new Integer[evens.size()];
        array = evens.toArray(array);

        return array;
    }
}
