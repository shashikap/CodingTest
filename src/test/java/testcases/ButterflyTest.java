package testcases;

import com.singtel.codingtest.object.Butterfly;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ButterflyTest {

    private Butterfly butterfly = new Butterfly();


    @Test
    public void testFly() {
        assertEquals("I am flying", butterfly.fly());
    }


}