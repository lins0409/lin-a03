/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 */

package baseline;
import java.util.Scanner;

/*
*Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
 */
public class Solution30 {

    public static void main (String[] args){
        Solution30 sol = new Solution30();
        //int j will be 12
        int j = 12;
        //call print function
        sol.printChart(j);
    }
    //print function that formats the printing of the charts
    void printChart(int tableSize){
        System.out.println();
        ////multiply i by k who will increase each loop until it hits j
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j ++){
                System.out.format("%4d", i*j);
            }
            System.out.println();
        }
    }
}
