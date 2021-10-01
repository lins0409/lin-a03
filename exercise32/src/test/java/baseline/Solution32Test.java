package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void statementCheckerHigh() {
        Solution32 sol = new Solution32();

        String guess = "60";
        int number = 30;
        int counter = 4;

        String expected = "Too high. Guess again: ";
        String actual = sol.statement(guess, number, counter);

        assertEquals(expected, actual);
    }

    @Test
    void statementCheckerCorrect() {
        Solution32 sol = new Solution32();

        String guess = "30";
        int number = 30;
        int counter = 4;

        String expected = "You got it in 4 guesses!";
        String actual = sol.statement(guess, number, counter);

        assertEquals(expected, actual);
    }

    @Test
    void statementCheckerLow() {
        Solution32 sol = new Solution32();

        String guess = "19";
        int number = 30;
        int counter = 4;

        String expected = "Too low. Guess again: ";
        String actual = sol.statement(guess, number, counter);

        assertEquals(expected, actual);
    }
}