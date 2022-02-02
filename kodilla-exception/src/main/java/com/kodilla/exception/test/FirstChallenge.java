package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        boolean ifSucceed = true;

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
            ifSucceed = true;

        } catch (ArithmeticException e) {
            System.out.println("We do not divide by O!" + e);
        } finally {

            if (ifSucceed) {
                System.out.println("Successful operation.");
            } else {
                System.out.println("Action failed...");
            }
        }
    }
}
