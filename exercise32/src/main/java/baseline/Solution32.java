/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sue Lin
 *
 */

package baseline;
import java.util.Locale;
import java.util.Scanner;

/*
*Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.
*
*Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.
 */
public class Solution32 {
    //initialize scanner
    private static final Scanner scanner = new Scanner(System.in);
    private static final Solution32 sol = new Solution32();

    //Initialize string for printing
    String result;

    public static void main (String[] args){
        //print put the starting prompt
        System.out.print("Let's play Guess the Number!\n\n");
        sol.startGame();
    }

    //beginning prompt for game
    void startGame(){
        //prompt for the starting level difficulty
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        //make sure that the value entered is a number
        while(!scanner.hasNextInt()){
            System.out.print("Invalid input, please enter a digit between 1 and 3\n");
            scanner.next();
        }
        //store the value to be passed into the if statements to call the correct
        int level = scanner.nextInt();
        //if the level is 1, run the easy mode function
        if (level == 1){
            sol.easyMode();
        }
        //if the level is 2, run the medium mode function
        else if(level == 2){
            sol.mediumMode();
        }
        //if the level is 3, run the hard more function
        else if(level == 3){
            sol.hardMode();
        }
    }

    public static boolean isNumeric(String str) {
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }

    //string for printing purposes
    String statement ( String guess, int number, int counter){
        String string = " ";
        //for input that isn't a number
        if(!isNumeric(string)){
            string = "Invalid guess. Guess again: ";
        }

        //if they guess correctly, they that they got it in however many guesses have passed
        if (Integer.parseInt(guess) == number) {
            string = "You got it in " + counter + " guesses!";
        }
        //if the guess is < than the random number, say they are too low and prompt them to guess again
        else if (Integer.parseInt(guess) < number) {
            //increase the guess counter by one, even if the value is a character
            string = "Too low. Guess again: ";
        }
        //if the guess is > than the random number, say that it is too high and prompt to guess again
        else if (Integer.parseInt(guess) > number) {
            //increase guess counter by one, even if the value is a character
            string = "Too high. Guess again: ";
        }
        return string;
    }

    //easy mode function
    void easyMode(){
        int min = 1;
        int max = 10;
        //randomly generate a number between 1 and 10
        int number = (int)(Math.random()*(max-min+1)+min);
        //start the guess counter at 0
        int counter = 0;
        String guess;

        //have the computer print that it has the number, prompt for the user's guess
        System.out.print("I have my number. What's your guess? ");
        do {
            guess = scanner.next();
            counter++;
            result = sol.statement(guess, number, counter);
            System.out.print(result);

        } while (Integer.parseInt(guess) != number);

        //prompt if they want to play again
        System.out.print("\nDo you wish to play again Y/N ? ");
        char selection = scanner.next().charAt(0);
        //if the answer us y or Y, call main. else break
        if(selection == 'y' || selection == 'Y'){
            sol.startGame();
        }
        else {
            System.exit(0);
        }
    }

    //medium mode function
    void mediumMode(){
        int min = 1;
        int max = 100;
        int number = (int)(Math.random()*(max-min+1)+min);
        //start the guess counter at 0
        int counter = 0;
        String guess;

        //have the computer print that it has the number, prompt for the user's guess
        System.out.print("I have my number. What's your guess? ");
        do {
            guess = scanner.next();
            counter++;
            result = sol.statement(guess, number, counter);
            System.out.print(result);

        } while (Integer.parseInt(guess) != number);

        //prompt if they want to play again
        System.out.print("\nDo you wish to play again Y/N ? ");
        char selection = scanner.next().charAt(0);
        //if the answer us y or Y, call main. else break
        if(selection == 'y' || selection == 'Y'){
            sol.startGame();
        }
        else {
            System.exit(0);
        }
    }
    //hard mode function
    void hardMode(){
        int min = 1;
        int max = 1000;
        //randomly generate a number between 1 and 1000
        int number = (int)(Math.random()*(max-min+1)+min);
        //start the guess counter at 0
        int counter = 0;
        String guess;

        //have the computer print that it has the number, prompt for the user's guess
        System.out.print("I have my number. What's your guess? ");
        do {
            guess = scanner.next();
            counter++;
            result = sol.statement(guess, number, counter);
            System.out.print(result);

        } while (Integer.parseInt(guess) != number);

        //prompt if they want to play again
        System.out.print("\nDo you wish to play again Y/N ? ");
        char selection = scanner.next().charAt(0);
        //if the answer us y or Y, call main. else break
        if(selection == 'y' || selection == 'Y'){
            sol.startGame();
        }
        else {
            System.exit(0);
        }
    }
}
