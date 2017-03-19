package nl.hu.iac.test;

import static junit.framework.Assert.*;

import nl.hu.iac.service.WindMolen;
import org.junit.Test;

import java.util.Random;

public class MyTest {
    // unittest 1
    @Test
    public void testWindMolenVermogen() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        WindMolen windmolen = new WindMolen(0,0,0,0, 0);
        windmolen.setId(randomInt);
        windmolen.setConstante(2);
        windmolen.setDiameter(2);
        windmolen.setMps(2);
        windmolen.setVermogen(windmolen.getConstante() * windmolen.getDiameter() * windmolen.getMps());
        assertEquals(windmolen.getVermogen(), 8.0);
    }

    // unittest 2
    @Test
    public void testWindMolenOpbouw() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        WindMolen windmolen = new WindMolen(0,0,0,0, 0);
        windmolen.setId(randomInt);
        windmolen.setConstante(2);
        windmolen.setDiameter(2);
        windmolen.setMps(2);
        assertEquals(windmolen.getConstante(), 2.0);
        assertEquals(windmolen.getDiameter(), 2.0);
        assertEquals(windmolen.getMps(), 2.0);
    }

}
