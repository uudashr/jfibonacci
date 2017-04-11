package io.github.uudashr.jfibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void number() {
        int[] data = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        for (int i = 0; i < data.length; i++) {
            int want = data[i];
            int got = Fibonacci.number(i);
            assertEquals(want, got);
        }
    }
    
}
