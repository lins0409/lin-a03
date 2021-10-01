/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
*/
package baseline;
import java.util.Scanner;

/*
*When you loop, you can control how much you increment the counter; you don’t always have to increment by one.
*When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output.
 */
public class Solution31 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        Solution31 sol = new Solution31();
        //prompt for age
        System.out.print("Enter your age: ");
        //make sure that if the entered result isn't a number don't continue
        while(!scanner.hasNextInt()){
            System.out.print("Please enter only a numeric value.\n");
            scanner.next();
            sol.mainCaller();
        }
        //scan the age in and store the value
        int age = scanner.nextInt();
        //call the resting heart rate storage function
        int restingHR = sol.restingHeart();

        sol.targetHeartRate(age, restingHR);
    }

    //function to call main again for the loop
    void mainCaller (){
        main(null);
    }

    //separate them into two functions so that you can't proceed until the values are numbers
    int restingHeart(){
        //prompt for their resting pulse
        System.out.print("Enter your resting heart rate: ");
        //scan the value and store it
        while(!scanner.hasNextInt()){
            System.out.print("Please enter only a numeric value.\n");
            scanner.next();
        }
        //call the targetHeartRate function
        return scanner.nextInt();
    }

    //calculates and prints out the table
    //pass in heart rate and age
    void targetHeartRate(int age, int restingHR){
        //initialize the intensity at 55
        int intensity = 55;
        //print out resting heart rate and age in the same line
        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        //print out intensity and rate separated by lines
        System.out.println("Intensity    | Rate ");
        System.out.println("-------------|--------");
        //make a loop to print out the percentages
        while (intensity <96){
            //calculate the target heart rate
            int TargetHeartRate = heartRateCalc(age, restingHR, intensity);
            System.out.println(intensity +"%          | "+ Math.round(TargetHeartRate) +"bpm");
            //increase the intensity by 5
            intensity+=5;
        }
    }

    //calculate heart rate function
    int heartRateCalc(int age, int resting, int intensity){
        return  (((220 - age) - resting) * intensity/100) + resting;
    }

}
