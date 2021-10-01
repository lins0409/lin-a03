package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void testingStoring(){
        List<Employees> list = new ArrayList<>();

        list.add(new Employees("John:", "Johnson", "Manager", "2016-12-31"));
        list.add(new Employees("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        list.add(new Employees("Jake", "Jacobson", "Programmer", " "));
        list.add(new Employees("Jacquelyn", "Jackson", "DBA", " "));

        assertEquals(4, list.size());
    }

}