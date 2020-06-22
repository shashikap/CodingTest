package testcases;

import com.singtel.codingtest.object.Fish;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FishTest {

    private Fish fish =  new Fish();

    @Test
    public void testSwim() {
        assertEquals("I am swimming", fish.swim());
    }
}