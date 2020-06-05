package InstrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", "Les Paul", 1500, 1999, 6);
    }

    @Test
    public void hasBrand(){
        assertEquals("Gibson", guitar.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1500, guitar.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(1999, guitar.getSellingPrice(), 0.1);
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Anyway, here's Wonderwall.", guitar.play());
    }
}
