package pro.sky.testhwork;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest2 {

    private CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> sumTestParam() {
        return Stream.of(
                Arguments.of(8,8,16),
                Arguments.of(8,-5,3),
                Arguments.of(7,1,8)
        );
    }

    public static Stream<Arguments> differenceTestParam() {
        return Stream.of(
                Arguments.of(5,2,3),
                Arguments.of(3,7,-4),
                Arguments.of(7,1,6)
        );
    }

    public static Stream<Arguments> multiplyTestParam() {
        return Stream.of(
                Arguments.of(5,5,25),
                Arguments.of(0,5,0),
                Arguments.of(7,1,7)
        );
    }

    public static Stream<Arguments> divideTestParam() {
        return Stream.of(
                Arguments.of(8,2,4),
                Arguments.of(-4,2,-2),
                Arguments.of(7,1,7)
        );
    }

    @ParameterizedTest
    @MethodSource("sumTestParam")
    public void sumTest(int num1,int num2, int expectedResult) {
        assertEquals(expectedResult, out.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("differenceTestParam")
    void difference(int num1,int num2, int expectedResult) {
        assertEquals(expectedResult, out.difference(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyTestParam")
    public void multiply(int num1,int num2, int expectedResult) {
        assertEquals(expectedResult, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideTestParam")
    void divide(int num1,int num2, int expectedResult) {
    }
}