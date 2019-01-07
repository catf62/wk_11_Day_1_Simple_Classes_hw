import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle superSparrow;

    @Before
    public void before() {
        superSparrow = new WaterBottle(100);
    }

    @Test
    public void canDrink10() {
        assertEquals(90, superSparrow.drinkTen());
    }

    @Test
    public void cannotDrink110() {
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        superSparrow.drinkTen();
        assertEquals(0, superSparrow.drinkTen());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, superSparrow.emptyBottle());
    }

    @Test
    public void canFill() {
        assertEquals(100, superSparrow.fillBottle());
    }



}
