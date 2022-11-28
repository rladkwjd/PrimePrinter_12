package com.cleancode;

public class PrimePrinter {
    private static final int NUMBER = 1000;
    private static final int LINES = 50;
    private static final int COLUMN = 4;

    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        NumberPrinter numberPrinter = new NumberPrinter(LINES, COLUMN);

        int primes[] = primeGenerator.generatePrimes(NUMBER);
        numberPrinter.print(primes, NUMBER);
    }
}