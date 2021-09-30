package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void printResultsTest() {
        Solution29 sol = new Solution29();
        int rate = 4;
        String expected = "It will take 18 years to double your initial investment.";
        String actual = sol.printResults(rate);

        assertEquals(expected, actual);
    }
}