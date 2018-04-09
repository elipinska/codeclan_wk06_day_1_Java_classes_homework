import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle();
    }

    @Test
    public void hasVolumeof200() {
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void drinkSubtracts10() {
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void emptyZerosVolume() {
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void fillBottleTo100() {
        myBottle.fill();
        assertEquals(100, myBottle.getVolume());
    }


}
