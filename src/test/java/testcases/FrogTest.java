package testcases;

import com.singtel.codingtest.object.Frog;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrogTest {

    private Frog frog = new Frog();

    @Test
    public void swimingTest() {
        assertEquals("I am swimming", frog.swim());
    }

    @Test
    public void walkingTest() {
        assertEquals("I am walking", frog.walk());
    }

    @Test
    public void soundTest() {
        assertEquals("ribbit, ribbit", frog.sound());
    }

}

