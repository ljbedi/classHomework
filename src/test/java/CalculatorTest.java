import com.codebase.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator ();
    }

    @Test
    public void canAdd() {
        assertEquals(3, calculator.addNumbers(1 , 2));
    }

    @Test
    public void canSub() {
        assertEquals( 5, calculator.subNumbers(10, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(15, calculator.multiplyNumbers(5, 3));

    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divideNumbers(15, 3),0.0 );
    }}




