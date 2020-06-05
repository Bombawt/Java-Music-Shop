package AccessoriesTests;

import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetmusic;

    @Before
    public void before(){
        sheetmusic = new SheetMusic(15.00, 34.99);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(15.00, sheetmusic.getBuyingPrice(), 0.1);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(34.99, sheetmusic.getSellingPrice(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(19.99, sheetmusic.calculateMarkup(), 0.1);
    }
}
