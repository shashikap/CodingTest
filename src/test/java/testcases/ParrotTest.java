package testcases;

import com.singtel.codingtest.object.Cat;
import com.singtel.codingtest.object.Dog;
import com.singtel.codingtest.object.Parrot;
import com.singtel.codingtest.object.Rooster;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParrotTest {

    @Test
    public void testParrotLivingWithDogs() {
        assertEquals("Woof, woof", Parrot.getSundOfParrotLivingWith(new Dog()).sound());
    }

    @Test
    public void testParrotLivingWithCats() {
        assertEquals("Meow", Parrot.getSundOfParrotLivingWith(new Cat()).sound());
    }

    @Test
    public void testParrotLivingWithRooster() {
        assertEquals("Cock-a-doodle-doo", Parrot.getSundOfParrotLivingWith(new Rooster()).sound());
    }
}