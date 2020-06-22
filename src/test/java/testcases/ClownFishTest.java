package testcases;

import com.singtel.codingtest.object.ClownFish;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClownFishTest {

    private ClownFish clownfish = new ClownFish();

    @Test
    public void testClownfishSize() {
        assertEquals("Small", clownfish.getSize());
    }

    @Test
    public void testClownfishColor() {
        assertEquals("Orange", clownfish.getColor());
    }

    @Test
    public void testMakeJoke() {
        assertEquals("Joke", clownfish.makeJokes());
    }
}
