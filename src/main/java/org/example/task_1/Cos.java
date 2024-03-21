package org.example.task_1;

public class Cos {
    public Double calculate(Double x, Integer iterations) {
        if (iterations < 1) {
            throw new IllegalArgumentException();
        }
        double result = 0D;
        for (int k = 0; k < iterations; k++) {
            result += calculate_iteration(x, k);
        }
        return result;
    }

    private Double calculate_iteration(Double x, Integer k) {
        return Math.pow(-1, k) * Math.pow(x, k + 1) / calculateFactorial(2 * k + 1);
    }

    private Integer calculateFactorial(Integer n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
