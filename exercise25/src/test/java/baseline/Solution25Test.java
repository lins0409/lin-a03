package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void testPasswordValidator(){
        Solution25 sol = new Solution25();

        String password = "1337h@xor!";
        String expected = "' is a very strong password.";
        String actual = sol.passwordValidator(password);

        assertEquals(expected, actual);
    }
}