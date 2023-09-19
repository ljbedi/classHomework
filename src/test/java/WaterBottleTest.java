import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle( 100);
    }

    @Test
    public void drinkBottle() {
        assertEquals(90, waterBottle.drinkBottle());
    }

    @Test
    public void empty() {
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fill() {
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }

}
