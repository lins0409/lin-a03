package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void testRemoval(){
        Solution34 sol = new Solution34();

        String[] actual = new String[] {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        List<String> list = new ArrayList<>(Arrays.asList(actual));

        String delete = "Chris Jones";

        String[] expected = list.toArray(actual);

        sol.removeEmployee(list, delete);
        actual = list.toArray(actual);

        assertEquals(expected, actual);
    }
}