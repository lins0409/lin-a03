/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.Scanner;

/*
*Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.
*
*Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.
 */
public class Solution32 {
    //initialize scanner
    public static void main (String[] args){
        //print put the starting prompt
        //prompt for the starting level difficulty
        //make sure that the value entered is a number
        //store the value to be passed into the if statements to call the correct
        //if the level is 1, run the easy mode function
        //if the level is 2, run the medium mode function
        //if the level is 3, run the hard more function
    }
    //easy mode function
    void easyMode(){
        //randomly generate a number between 1 and 10
        //start the guess counter at 0
        //have the computer print that it has the number, prompt for the user's guess
        //if the guess is < than the random number, say they are too low and prompt them to guess again
            //increase the guess counter by one, even if the value is a character
        //if the guess is > than the random number, say that it is too high and prompt to guess again
            //increase guess counter by one, even if the value is a character
        //if they guess correctly, they that they got it in however many guesses have passed

        //prompt if they want to play again
    }
    //medium mode function
    void mediumMode(){
        //randomly generate a number between 1 and 100
        //start the guess counter at 0
        //have the computer print that it has the number, prompt for the user's guess
        //if the guess is < than the random number, say they are too low and prompt them to guess again
            //increase the guess counter by one, even if the value is a character
        //if the guess is > than the random number, say that it is too high and prompt to guess again
            //increase guess counter by one, even if the value is a character
        //if they guess correctly, they that they got it in however many guesses have passed

        //prompt if they want to play again
    }
    //hard mode function
    void hardMode(){
        //randomly generate a number between 1 and 1000
        //start the guess counter at 0
        //have the computer print that it has the number, prompt for the user's guess
        //if the guess is < than the random number, say they are too low and prompt them to guess again
            //increase the guess counter by one, even if the value is a character
        //if the guess is > than the random number, say that it is too high and prompt to guess again
            //increase guess counter by one, even if the value is a character
        //if they guess correctly, they that they got it in however many guesses have passed

        //prompt if they want to play again
    }
}
