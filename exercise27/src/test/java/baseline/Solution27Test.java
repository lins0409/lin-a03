package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputTest() {
        Solution27 sol = new Solution27();

        String firstName = "John";
        String lastName =" Johnson";
        String zipCode = "55555";
        String ID = "TK-4321";

        String expected = "There were no errors found.\n";
        String actual = sol.validateInput(firstName, lastName, zipCode, ID);

        assertEquals(expected, actual);
    }
}