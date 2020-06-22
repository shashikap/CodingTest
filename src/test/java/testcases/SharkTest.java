package testcases;

import com.singtel.codingtest.object.Fish;
import com.singtel.codingtest.object.Shark;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SharkTest {

    private Shark shark = new Shark();

    @Test
    public void testSharkSize() {
        assertEquals("Large", shark.getSize());
    }

    @Test
    public void testSharkColor() {
        assertEquals("Grey", shark.getColor());
    }

    @Test
    public void testEat() {
        Fish fish = new Fish();
        assertEquals("I am eating another fish:" + fish, shark.eats(fish));
    }
}
