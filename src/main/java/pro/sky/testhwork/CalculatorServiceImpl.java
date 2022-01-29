package pro.sky.testhwork;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int difference(int num1, int num2) {

        return num1 - num2;
    }

    public int multiply(int num1, int num2) {

        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("делить на 0 запрещено");
        }
        return num1 / num2;
    }
}