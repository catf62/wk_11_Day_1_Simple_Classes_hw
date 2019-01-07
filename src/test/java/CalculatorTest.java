import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(8, calculator.addUp(3, 5));
    }

    @Test
    public void canSubtract(){
        assertEquals(2,calculator.subtractDown(5, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(9, calculator.multiplyUp(3, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divideDown(12, 4));
    }

}
