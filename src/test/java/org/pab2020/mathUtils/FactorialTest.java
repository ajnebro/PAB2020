package org.pab2020.mathUtils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test cases:
 * - 0 -> 1
 * - 1 -> 1
 * - 2 -> 2
 * - 4 -> 24
 * - negative -> raise an exception
 */
class FactorialTest {
  private Factorial factorial ;

  @BeforeEach
  public void setup() {
    factorial = new Factorial() ;
  }

  @Test
  public void shouldFactorialOf0Return1() {
    long expectedValue = 1 ;
    long obtainedValue = factorial.compute(0) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf1Return1() {
    long expectedValue = 1 ;
    long obtainedValue = factorial.compute(1) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf2Return2() {
    long expectedValue = 2 ;
    long obtainedValue = factorial.compute(2) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf4Return24() {
    long expectedValue = 24 ;
    long obtainedValue = factorial.compute(4) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOfANegativeNumberRaiseAnException() {
    assertThrows(RuntimeException.class, () -> factorial.compute(-1));
  }
}