package testcases;

import com.singtel.codingtest.object.Rooster;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoosterTest {

    private Rooster rooster = new Rooster();

    @Test
    public void singingTest(){
        assertEquals("Cock-a-doodle-doo", rooster.sound());
    }

    @Test
    public void soundForLanguage(){

        assertEquals("kikiriki",rooster.sound("Greek"));
    }
}
