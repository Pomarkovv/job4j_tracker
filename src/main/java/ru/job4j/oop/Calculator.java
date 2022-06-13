package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int q) {
        return q / x;
    }

    public int sumAllOperation(int b) {
        return sum(b) + minus(b) + multiply(b) + divide(b);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int minus = Calculator.minus(2);
        System.out.println(minus);
        Calculator calc = new Calculator();
        int multiply = calc.multiply(10);
        int divide = calc.divide(2);
        System.out.println(multiply);
        System.out.println(divide);
        int sumAll = calc.sumAllOperation(10);
        System.out.println(sumAll);
    }
}
