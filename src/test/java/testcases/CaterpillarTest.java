package testcases;

import com.singtel.codingtest.object.Caterpillar;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CaterpillarTest {

    private Caterpillar caterpillar = new Caterpillar();

    @Test
    public void walkingTest() {
        assertEquals("I am crawling", caterpillar.walk());
    }

    @Test
    public void testMetamorphosis() {
        assertNotNull(caterpillar.metamorphosis());
    }

}