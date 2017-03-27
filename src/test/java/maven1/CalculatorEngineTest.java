package maven1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorEngineTest {
	
	private CalculatorEngine calcEngine = new CalculatorEngine();
    //private CalculatorView calcView = new CalculatorView();

    @Before
    public void runBeforeEveryTest() {
        calcEngine.currentTotal = 0;
    }

    @Test
    public void testGetTotalStringInt() throws Exception {
        calcEngine.currentTotal = 50;
        assertEquals(5000000, calcEngine.currentTotal, 1e-6);
    }

    @Test
    public void testEqual() throws Exception {
        calcEngine.equal("20");
        assertEquals(20, calcEngine.currentTotal, 20.0);
    }

    @Test
    public void testAdd() throws Exception {
        calcEngine.add(20);
        assertEquals(20, calcEngine.currentTotal, 20.0);

    }

    @Test
    public void testSubtract() throws Exception {
        calcEngine.subtract(20);
        assertEquals(-20, calcEngine.currentTotal, -20.0);
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        calcEngine.multiply(10);
        assertEquals(0, calcEngine.currentTotal, 0.0);
    }

    @Test
    public void testDivideByZero() throws Exception {
        calcEngine.divide(10);
        assertEquals(0, calcEngine.currentTotal, 0.0);
    }

    @Test
    public void testMultiply() throws Exception {
        calcEngine.add(10);
        calcEngine.multiply(10);
        assertEquals(100, calcEngine.currentTotal, 100.0);
    }

    @Test
    public void testDivide() throws Exception {
        calcEngine.add(10);
        calcEngine.divide(10);
        assertEquals(1, calcEngine.currentTotal, 1.0);
    }

}
