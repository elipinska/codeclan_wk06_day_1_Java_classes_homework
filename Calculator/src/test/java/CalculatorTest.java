import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator myCalculator;

    @Before
    public void before() {
//        myCalculator = new Calculator(150, 42);
          myCalculator = new Calculator();
    }

    @Test
    public void addEquals192() {
        assertEquals(192, myCalculator.add(150, 42));
    }

    @Test
    public void subtractEquals108() {
        assertEquals(3, myCalculator.subtract(7, 4));
    }

    @Test
    public void multiplyEquals6300() {
        assertEquals(48, myCalculator.multiply(16, 3));
    }

    @Test
    public void divideEquals6300() {
        assertEquals(15, myCalculator.divide(60, 4));
    }

}
