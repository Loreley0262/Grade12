import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class PlanetTest {
    Planet planet;
    private ArrayList<Moon> moons;


    @Before
    public void setup(){
        planet = new Planet();
    }

    @Test
    public void testOrbitTime(){
        //check planet orbitTime is 11111
        assertEquals(11111, planet.getOrbitTime());
    }

    @Test
    public void testMoonListSize(){
        //check moon size increases after adding a moon
        //check moon size is 0
        assertEquals(0, moons.size());
        //make new moon for planet
        moons.addMoon();
        //check # of moons is 1
    }
}
