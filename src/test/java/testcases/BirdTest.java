package testcases;

import com.singtel.codingtest.object.Bird;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BirdTest {

    private Bird bird = new Bird();

    @Test
    public void flyingTest(){
        assertEquals("I am flying", bird.fly());
    }

    @Test
    public void walkingTest(){
        assertEquals("I am walking", bird.walk());
    }

    @Test
    public void singingTest(){
        assertEquals("I am singing", bird.sound());
    }
}
