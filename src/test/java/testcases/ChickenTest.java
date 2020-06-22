package testcases;

import com.singtel.codingtest.object.Chicken;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    public void singingTest(){
        assertEquals("Cluck, cluck", chicken.sound());
    }

    @Test
    public void flyingTest(){
        assertEquals("I can't fly", chicken.fly());
    }
}
