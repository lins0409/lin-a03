package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    public void isAnagram() {
        Solution24 sol = new Solution24();

        String one = "tone";
        String two = "note";

        boolean expected = true;
        boolean actual = sol.isAnagram(one, two);

        assertEquals(expected, actual);
    }

}