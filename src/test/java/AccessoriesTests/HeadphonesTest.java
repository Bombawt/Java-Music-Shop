package AccessoriesTests;

import accessories.Headphones;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphonesTest {

    private Headphones headphones;

    @Before
    public void before(){
        headphones = new Headphones(75.65, 186.99);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(75.65, headphones.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(186.99, headphones.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(111.34, headphones.calculateMarkup(), 0.1);
    }
}
