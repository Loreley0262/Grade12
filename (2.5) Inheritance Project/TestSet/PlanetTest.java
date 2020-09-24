import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class PlanetTest {
    Planet planet;
    private ArrayList<Moon> moonList;
    Planet gasplanet;
    Planet rockplanet;

    //CHANGE MOONLIST VARIABLE TO MOONS B/C I RENAMED IT TO SMTH ELSE


    @Before
    public void setup(){
        planet = new Planet();
        moonList = new ArrayList<Moon>();
    }

    //- if the equal method could tell whether or not the classes are the same (e.g GasPlanet != RockPlanet)
    //- if the equal method could tell whether or not two planets were exactly the same
    //- if the equal method could tell whether or not two planets were not the same

    @Test
    public void areClassesTheSame(){
        //make 2 planets
        gasplanet = new GasPlanet(11111, "gp", false, Color.blue);
        assertEquals(11111, planet.getOrbitTime());
    }

    @Test
    public void testMoonListSize(){     //check moon size increases after adding a moon, checks moon constructor works
        //check moon size is 0
        assertEquals(0, moonList.size());
        //make new moon for planet
        Moon moonTest = new Moon(planet, 11111, true, "moonname");
        moonList.add(moonTest);
        //check # of moons is 1
        assertEquals(1, moonList.size());
    }

    @Test
    public void testGasPlanet(){
        //check GasPlanet exists, has time and designation
        gasplanet = new GasPlanet(11111, "gassy", false, Color.blue);
        assertEquals(11111, gasplanet.getOrbitTime());
        assertEquals("gassy", gasplanet.getDesignation());
    }

    @Test
    public void testRockPlanet(){
        //check RockPlanet exists, has time and designation
        rockplanet = new RockPlanet(11111, "gassy", false);
        assertEquals(11111, rockplanet.getOrbitTime());
        assertEquals("gassy", rockplanet.getDesignation());
    }

    @Test
    public void testEqualsPlanet(){
        //check RockPlanet exists, has time and designation
        rockplanet = new RockPlanet(11111, "gassy", false);
        assertEquals(11111, rockplanet.getOrbitTime());
        assertEquals("gassy", rockplanet.getDesignation());
    }

}
