package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void testFormatting(){
        Solution30 sol = new Solution30();
        int tableSize = 10;
        int actual = sol.multiplication(10, tableSize);
        int expected = 100;

        assertEquals(expected, actual);
    }
}