package com.apeiro.sample;

/**
 * Sample calculator class for SonarQube DEV integration testing.
 * Contains intentional code smells for SonarQube to detect.
 */
public class Calculator {

    // Code smell: magic numbers
    public double calculateTax(double amount) {
        return amount * 0.16;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Bug: division by zero not handled
    public int divide(int a, int b) {
        return a / b;
    }

    // Code smell: unused variable
    public String formatAmount(double amount) {
        String currency = "KES";
        return String.format("%.2f", amount);
    }

    // Code smell: empty catch block
    public int parseNumber(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            // swallowed exception
        }
        return 0;
    }
}
