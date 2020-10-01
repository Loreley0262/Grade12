import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class Test {
    String "jello";


    @Before
    public void setup(){
        planet = new Planet();
        moonList = new ArrayList<Moon>();
        gasplanet = new GasPlanet(11111, "gp", false, Color.blue);
        rockplanet = new RockPlanet(11111, "rp", false);
        gasmoon = new Moon(gasplanet, 11111, true, "gassymoon");
        rockmoon = new Moon(rockplanet, 11111, false, "rockymoon");
    }

    //- if the equal method could tell whether or not the classes are the same (e.g GasPlanet != RockPlanet)
    //- if the equal method could tell whether or not two planets were exactly the same
    //- if the equal method could tell whether or not two planets were not the same

    @Test
    public void testAreClassesTheSame(){
        assertFalse(gasplanet.equals(rockplanet));
        assertFalse(gasmoon.equals(rockmoon));
    }

    @Test
    public void testAreObjectsIdentical(){
        gasmoon1 = new Moon (gasplanet, 11111, true, "gassymoon");
        rockmoon1 = new Moon(rockplanet, 11111, false, "rockymoon");
        assertTrue(gasmoon.equals(gasmoon1));
        assertTrue(rockmoon.equals(rockmoon1));
        gasplanet1 = new GasPlanet(11111, "gp", false, Color.blue);
        rockplanet1 = new RockPlanet(11111, "rp", false);
        assertTrue(gasplanet.equals(gasplanet1));
        assertTrue(rockplanet.equals(rockplanet1));
    }

    @Test
    public void testAreObjectsDifferent(){
        gasmoon1 = new Moon (gasplanet, 1111, true, "gassymoon");
        rockmoon1 = new Moon(rockplanet, 1111, false, "rockymoon");
        assertFalse(gasmoon.equals(gasmoon1));
        assertFalse(rockmoon.equals(rockmoon1));
        gasplanet1 = new GasPlanet(1111, "gp", false, Color.blue);
        rockplanet1 = new RockPlanet(1111, "rp", false);
        assertFalse(gasplanet.equals(gasplanet1));
        assertFalse(rockplanet.equals(rockplanet1));
    }

    @Test
    public void testEqualsPlanet(){
        //check RockPlanet exists, has time and designation
        rockplanet = new RockPlanet(11111, "gassy", false);
        assertEquals(11111, rockplanet.getOrbitTime());
        assertEquals("gassy", rockplanet.getDesignation());
    }

}
