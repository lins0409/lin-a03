package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator1() {
        Solution25 sol = new Solution25();

        String passwordOne = "12345";
        String one = "The password '12345' is a very weak password.";
        String actual = sol.passwordValidator(passwordOne);

        assertEquals(one , actual);
    }
}