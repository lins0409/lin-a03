package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void randomResponseTest1() {
        Solution33 sol = new Solution33();
        int random = 0;

        String expected = "Yes";
        String actual = sol.randomResponse(random);

        assertEquals(expected, actual);
    }

    @Test
    void randomResponseTest2() {
        Solution33 sol = new Solution33();
        int random = 1;

        String expected = "No";
        String actual = sol.randomResponse(random);

        assertEquals(expected, actual);
    }

    @Test
    void randomResponseTest3() {
        Solution33 sol = new Solution33();
        int random = 2;

        String expected = "Maybe";
        String actual = sol.randomResponse(random);

        assertEquals(expected, actual);
    }

    @Test
    void randomResponseTest4() {
        Solution33 sol = new Solution33();
        int random = 3;

        String expected = "Ask again later.";
        String actual = sol.randomResponse(random);

        assertEquals(expected, actual);
    }
}