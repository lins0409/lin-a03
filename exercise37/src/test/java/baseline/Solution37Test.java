package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {

    @Test
    void randomPasswordMakerTestNumbers() {
        Solution37 sol = new Solution37();

        int special = 2;
        int numbers = 2;
        int length = 8;

        String password = sol.randomPasswordMaker(length, special, numbers);

        int expected = 2;
        int actual = numberCounter(password);

        assertEquals(expected, actual);
    }

    int numberCounter (String password){
        int numberCount = 0;
        for (int i = 0; i < password.length() - 1; i++) {
            char location = password.charAt(i);
            boolean x = Character.isDigit(location);
            if (x) {
                numberCount++;
            }
        }
        return numberCount;
    }
}