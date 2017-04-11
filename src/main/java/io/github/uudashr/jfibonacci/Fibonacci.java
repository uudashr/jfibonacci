package io.github.uudashr.jfibonacci;

/**
 * This class will provide basic fibonacci functionality.
 *
 */
public class Fibonacci {
    /**
     * Compute fibonacci number on specific index.
     *
     * @param i is the index
     * @return the fibonacci number
     */
    public static int number(int i) {
        if (i < 2) {
            return i;
        }

        return number(i - 2) + number(i - 1);
    }
}