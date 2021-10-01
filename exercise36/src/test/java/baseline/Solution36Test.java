package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    @Test
    void averageTest() {
        Solution36 sol = new Solution36();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        double expected = 400.0;
        double actual = sol.average(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void maxTest() {
        Solution36 sol = new Solution36();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        int expected = 1000;
        int actual = sol.max(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void minTest() {
        Solution36 sol = new Solution36();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        int expected = 100;
        int actual = sol.min(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void stdTest() {
        Solution36 sol = new Solution36();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(1000);
        numbers.add(300);

        double expected = 353.5533905932738;
        double actual = sol.std(numbers);

        assertEquals(expected, actual);
    }
}