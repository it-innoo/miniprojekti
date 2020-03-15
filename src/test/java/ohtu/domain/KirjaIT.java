
package ohtu.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Kija tests.
 * @author jukka
 */
public class KirjaIT {

    public KirjaIT() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTyyppi method, of class Kirja.
     */
    @Test
    public void testGetTyyppi() {
        System.out.println("getTyyppi");
        Kirja kirja = new Kirja("Kirja",
                "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        String expResult = "Kirja";
        String result = kirja.getTyyppi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getOtsikko method, of class Kirja.
     */
    @Test
    public void testGetOtsikko() {
        System.out.println("getOtsikko");
        Kirja kirja = new Kirja("Kirja",
                "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        String expResult = "Clean Code: A Handbook of Agile Software Craftsmanship";
        String result = kirja.getOtsikko();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getKirjoittaja method, of class Kirja.
     */
    @Test
    public void testGetKirjoittaja() {
        System.out.println("getKirjoittaja");
        String expResult = "Robert Martin";
        Kirja kirja = new Kirja(
                "Kirja", "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        String result = kirja.getKirjoittaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setTyyppi method, of class Kirja.
     */
    @Test
    public void testSetTyyppi() {
        System.out.println("setTyyppi");
        String tyyppi = "Kirja";
        Kirja kirja = new Kirja();
        kirja.setTyyppi(tyyppi);
        String result = kirja.getTyyppi();
        assertEquals(tyyppi, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOtsikko method, of class Kirja.
     */
    @Test
    public void testSetOtsikko() {
        System.out.println("setOtsikko");
        String otsikko = "Clean Code: A Handbook of Agile Software Craftsmanship";
        Kirja kirja = new Kirja();
        kirja.setOtsikko(otsikko);
        String result = kirja.getOtsikko();
        assertEquals(otsikko, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setKirjoittaja method, of class Kirja.
     */
    @Test
    public void testSetKirjoittaja() {
        System.out.println("setKirjoittaja");
        String kirjoittaja = "Robert Martin";
        Kirja kirja = new Kirja();
        kirja.setKirjoittaja(kirjoittaja);
        String result = kirja.getKirjoittaja();
        assertEquals(kirjoittaja, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Kirja.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Kirja(
                "Kirja", "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        Kirja kirja = new Kirja(
                "Kirja", "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        boolean expResult = true;
        boolean result = kirja.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Kirja.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Kirja instance = new Kirja();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Kirja.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Kirja instance = new Kirja();
        int expResult = 357642;
        int result = instance.hashCode();
        System.out.println(instance.hashCode());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Kirja.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Kirja kirja = new Kirja("Kirja",
                "Robert Martin",
                "Clean Code: A Handbook of Agile Software Craftsmanship");
        String expResult = "Kirjoittaja: Robert Martin\n"
                + "Otsikko: Clean Code: A Handbook of Agile Software Craftsmanship\n"
                + "Tyyppi: Kirja";
        String result = kirja.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
