package org.pab2020.mathUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test cases:
 * - 0 -> 1
 * - 1 -> 1
 * - 2 -> 2
 * - 4 -> 24
 * - 30 -> 265252859812191058636308480000000
 * - 40 -> 815915283247897734345611269596115894272000000000
 * - negative -> raise an exception
 *
 * 30! and 40! would cause a value overflow even of a long data type
 * to avoid this, Big Integer was used.
 */
class FactorialTest {
  private Factorial factorial ;

  @BeforeEach
  public void setup() {
    factorial = new Factorial() ;
  }

  @Test
  public void shouldFactorialOf0Return1() {
    BigInteger expectedValue = BigInteger.ONE ;
    BigInteger obtainedValue = factorial.compute(0) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf1Return1() {
    BigInteger expectedValue = BigInteger.ONE ;
    BigInteger obtainedValue = factorial.compute(1) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf2Return2() {
    BigInteger expectedValue = BigInteger.TWO ;
    BigInteger obtainedValue = factorial.compute(2) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf4Return24() {
    BigInteger expectedValue = BigInteger.valueOf(24) ;
    BigInteger obtainedValue = factorial.compute(4) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf40Return815915283247897734345611269596115894272000000000() {
    BigInteger expectedValue = new BigInteger("815915283247897734345611269596115894272000000000");
    BigInteger obtainedValue = factorial.compute(40);

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf30Return265252859812191058636308480000000() {
    BigInteger expectedValue = new BigInteger("265252859812191058636308480000000");
    BigInteger obtainedValue = factorial.compute(30);

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOfANegativeNumberRaiseAnException() {
    assertThrows(RuntimeException.class, () -> factorial.compute(-1));
  }
}