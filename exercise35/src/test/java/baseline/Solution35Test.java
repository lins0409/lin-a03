package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    //there are chances that the test may fail because it is testing the randomizer
    @Test
    void randomizerTester() {
        Solution35 sol = new Solution35();

        String expected = "Maggie";
        ArrayList<String> names = new ArrayList<String>();

        names.add("Homer");
        names.add("Bart");
        names.add("Maggie");
        names.add("Lisa");
        names.add("Moe");

        String actual = sol.randomizer(names);

        assertEquals(expected, actual);
    }
}