/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until the user enters done
 */
public class Solution36 {
    //initialize scanner and Solution36 instance
    private static final Scanner scanner = new Scanner(System.in);
    public static final Solution36 sol = new Solution36();

    public static void main (String[] args){
        //create an array that stores the numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;
        //prompt the user to input values continuously until they enter done
        do{
            System.out.print("Enter a number: ");
            input = scanner.next();
            if (!input.equals("done")){
                try{
                    int num = Integer.parseInt(input);
                    numbers.add(num);
                } //it doesn't add anything to the array
                catch (NumberFormatException nfe){

                }
            }
        }while (!input.equals("done"));
        //print out the numbers in the array
        System.out.println("Numbers: "+ numbers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        //call the functions average, max, min and std
        double avg = sol.average(numbers);
        System.out.println("The average is " + avg);
        int minimum = sol.min(numbers);
        System.out.println("The minimum is " + minimum);
        int maximum = sol.max(numbers);
        System.out.println("The maximum is " + maximum);
        double standardDev = sol.std(numbers);
        System.out.println("The standard deviation is " + String.format("%.2f",standardDev));
    }
    //average function
    double average(ArrayList<Integer> numbers){
        //add all the values together and then divide it by how many values are in array
        int total = 0;
        for(int num: numbers){
            total += num;
        }
        return (double) total/numbers.size();
    }

    //max function
    int max(ArrayList<Integer> numbers){
        //find what the largest number is by assigning the first number as the max, and then if there is a number bigger than it assign that is the new max
        int max = numbers.get(0);
        for(int num: numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    //min function
    int min (ArrayList<Integer> numbers){
        //find what the smallest number is by assigning the first number as the min, and then if there is a number smaller than it assign that is the new min
        int min = numbers.get(0);
        for(int num: numbers){
            if (num < min){
                min = num;
            }
        }
        return min;
    }

    //std function
    double std(ArrayList<Integer> numbers){
        //calculate the standard deviation
        double mean = average(numbers);
        double sum = 0;
        for(int num: numbers){
            sum = sum + Math.pow((num - mean), 2);
        }
        return Math.sqrt(sum/numbers.size());
    }
}
