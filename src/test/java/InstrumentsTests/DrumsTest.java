package InstrumentsTests;

import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums("Yamaha", "Rydeen", 200, 500, 5);
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", drums.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Rydeen", drums.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(200, drums.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500, drums.getSellingPrice(), 0.1);
    }

    @Test
    public void hasNumOfPieces(){
        assertEquals(5, drums.getnumOfPieces());
    }

    @Test
    public void canPlay(){
        assertEquals("CadburysGorilla.gif", drums.play());
    }
}
