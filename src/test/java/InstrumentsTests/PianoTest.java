package InstrumentsTests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", "CF Concert", 22000, 34000, "Concert Grand");
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("CF Concert", piano.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(22000, piano.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(34000, piano.getSellingPrice(), 0.1);
    }

    @Test
    public void hasType(){
        assertEquals("Concert Grand", piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("keyboardcat.gif", piano.play());
    }
}
