package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 2
        Product p = new Product();

        // Task 3
        int result1 = p.product(5, 10);
        System.out.println("Result 1: " + result1);

        // Task 4
        int result2 = p.product(5, 10, 2);
        System.out.println("Result 2: " + result2);

        // Task 5
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result 3: " + result3);
    }
}

class Product {
    // Task 3
    public int product(int x, int y) {
        return x * y;
    }

    // Task 4
    public int product(int x, int y, int z) {
        return x * y * z;
    }

    // Task 5
    public double product(double x, double y) {
        return x * y;
    }
}
