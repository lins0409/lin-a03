package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void testingResults() {
        Solution28 sol = new Solution28();
        int total = 0;
        int expected = 15;
        int j = 1;

        for( int i = 0; i < 5; i++){
            total += j;
            j++;
        }

        int actual = sol.totalReturn(total);

        assertEquals(expected, actual);
    }
}