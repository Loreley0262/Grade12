import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class PlanetTest {
    Planet planet;
    private ArrayList<Moon> moons;

    //CHANGE MOONLIST VARIABLE TO MOONS B/C I RENAMED IT TO SMTH ELSE


    @Before
    public void setup(){
        planet = new Planet();
        moons = new ArrayList<Moon>();
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
        Moon moonTest = new Moon(planet, 11111, true, "moonname");
        moons.add(moonTest);
        //check # of moons is 1
        assertEquals(1, moons.size());
    }
}
