package InstrumentsTests;

import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Jean Paul USA", "TR-330", 125, 199.99, 3);
    }

    @Test
    public void hasBrand(){
        assertEquals("Jean Paul USA", trumpet.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("TR-330", trumpet.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(125, trumpet.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(199.99, trumpet.getSellingPrice(), 0.1);
    }

    @Test
    public void hasNumOfValves(){
        assertEquals(3, trumpet.getNumOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Toot!", trumpet.play());
    }
}
