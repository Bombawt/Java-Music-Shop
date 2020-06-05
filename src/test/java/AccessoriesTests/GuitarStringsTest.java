package AccessoriesTests;

import accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5.50, 19.95);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(5.50, guitarStrings.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(19.95, guitarStrings.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(14.45, guitarStrings.calculateMarkup(), 0.1);
    }
}
