package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void testingTargetHeartRateCalc() {
        Solution31 sol = new Solution31();
        int age = 22;
        int rate = 65;
        int intensity = 55;
        int expected = 138;

        int actual = sol.heartRateCalc(age, rate, intensity);

        assertEquals(expected, actual);
    }
}