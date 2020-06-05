package AccessoriesTests;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(35.00, 69.99);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(35.00, drumSticks.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(69.99, drumSticks.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(34.99, drumSticks.calculateMarkup(), 0.1);
    }
}
