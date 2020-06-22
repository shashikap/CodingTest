package testcases;

import com.singtel.codingtest.object.Duck;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DuckTest {

    Duck duck = new Duck();

    @Test
    public void singingTest(){
        assertEquals("Quack, quack", duck.sound());
    }

    @Test
    public void swimingTest(){
        assertEquals("I can swim",duck.swim());

    }
}
