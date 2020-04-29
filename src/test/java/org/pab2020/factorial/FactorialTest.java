package org.pab2020.factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pab2020.factorial.Factorial;

import static org.junit.jupiter.api.Assertions.*;

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
  public void shouldFactorialOf3Return6() {
    long expectedValue = 6 ;
    long obtainedValue = factorial.compute(3) ;

    assertEquals(expectedValue, obtainedValue) ;
  }

  @Test
  public void shouldFactorialOf4Return24() {
    long expectedValue = 24 ;
    long obtainedValue = factorial.compute(4) ;

    assertEquals(expectedValue, obtainedValue) ;
  }

  @Test
  public void shouldFactorialOfANegativeNumberRaiseAnException() {
    Assertions.assertThrows(RuntimeException.class, () -> factorial.compute(-1)) ;
  }
}