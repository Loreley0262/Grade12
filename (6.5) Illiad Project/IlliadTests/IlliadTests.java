import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static junit.framework.TestCase.*;

public class IlliadTests {
    String hi;
    String hello;
    String bonjour;


    @Before
    public void setup(){
        hi = "hiii";
        hello = "hello";
        bonjour = "hiii";
    }

    //- if the equal method could tell whether or not the classes are the same (e.g GasPlanet != RockPlanet)
    //- if the equal method could tell whether or not two planets were exactly the same
    //- if the equal method could tell whether or not two planets were not the same

    @Test
    public void testAreClassesTheSame(){
        assertFalse(hi.equals(hello));
        assertTrue(hi.equals(hi));
    }


}
