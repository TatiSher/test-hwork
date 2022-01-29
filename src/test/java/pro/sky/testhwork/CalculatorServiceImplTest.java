package pro.sky.testhwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void testSum1() {
        int result = out.sum(8, 8);
        assertEquals(16, result);
    }

    @Test
    public void testSum2() {
        int result = out.sum(8, -5);
        assertEquals(3, result);
    }
    @Test
    public void testDifference1() {
        int result = out.difference(5,2);
        assertEquals(3, result);
    }

    @Test
    public void testDifference2() {
        int result = out.difference(3,7);
        assertEquals(-4, result);
    }

    @Test
    public void testMultiply1() {
        int result = out.multiply(5,5);
        assertEquals(25, result);
    }

    @Test
    public void testMultiply2() {
        int result = out.multiply(0,5);
        assertEquals(0, result);
    }

    @Test
    public void testDivide1() {
        int result = out.divide(8,2);
        assertEquals(4, result);
    }

    @Test
    public void testDivide2() {
        int result = out.divide(-4,2);
        assertEquals(-2, result);
    }

    @Test
    public void testDivide3() {
        assertThrowsExactly(IllegalArgumentException.class, () -> out.divide(7,0));
    }

}