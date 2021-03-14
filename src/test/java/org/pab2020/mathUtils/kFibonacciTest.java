package org.pab2020.mathUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test case
 * negative n -> raise Exception
 * n=3, k=3 -> 4
 * n=4, k=3 -> 7
 * n=5, k=3 -> 19
 *
 * n=3, k=4 -> 5
 * n=4, k=4 -> 9
 * n=5, k=4 -> 29
 */
public class kFibonacciTest {
    private kFibonacci kfibonacci;

    @BeforeEach
    public void setup() {kfibonacci = new kFibonacci();}

    @Test
    public void kFibonacciNegativeShouldRaiseException() {
        assertThrows(RuntimeException.class, () -> kfibonacci.compute(-4, 3));
    }

    @Test
    public void kFibonacciN3K3shouldReturn4() {
        long expectedValue = 4;
        long obtainedValue = kfibonacci.compute(3, 3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void kFibonacciN4K3shouldReturn4() {
        long expectedValue = 7;
        long obtainedValue = kfibonacci.compute(4, 3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void kFibonacciN5K3shouldReturn4() {
        long expectedValue = 19;
        long obtainedValue = kfibonacci.compute(5, 3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void kFibonacciN3K4shouldReturn4() {
        long expectedValue = 5;
        long obtainedValue = kfibonacci.compute(3, 4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void kFibonacciN4K4shouldReturn4() {
        long expectedValue = 9;
        long obtainedValue = kfibonacci.compute(4, 4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void kFibonacciN5K4shouldReturn4() {
        long expectedValue = 29;
        long obtainedValue = kfibonacci.compute(5, 4);

        assertEquals(expectedValue, obtainedValue);
    }


}
