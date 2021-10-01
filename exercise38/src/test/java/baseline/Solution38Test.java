package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbersTest() {
        Solution38 sol = new Solution38();
        String input = "1 2 3 4 5 6 7 8";
        String[] otherInput = {"2" , "4", "6", "8"};
        String[] numbers = input.split(" ");
        String[] newNumbers = otherInput;

        Integer[] actual = sol.filterEvenNumbers(numbers);
        Integer[] expected = sol.filterEvenNumbers(newNumbers);

        assertEquals(expected, actual);
    }
}