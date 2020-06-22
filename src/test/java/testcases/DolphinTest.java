package testcases;

import com.singtel.codingtest.object.Dolphin;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DolphinTest {

    private Dolphin dolphin = new Dolphin();


    @Test
    public void swimingTest() {
        assertEquals("I am swimming", dolphin.swim());
    }
}