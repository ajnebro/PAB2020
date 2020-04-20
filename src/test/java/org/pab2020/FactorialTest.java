package org.pab2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
  @Test
  public void shouldFactorialOf0Return1() {
    Factorial factorial = new Factorial() ;

    long expectedValue = 1 ;
    long obtainedValue = factorial.compute(0) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf1Return1() {
    Factorial factorial = new Factorial() ;

    long expectedValue = 1 ;
    long obtainedValue = factorial.compute(1) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf2Return2() {
    Factorial factorial = new Factorial() ;

    long expectedValue = 2 ;
    long obtainedValue = factorial.compute(2) ;

    assertEquals(expectedValue, obtainedValue);
  }

  @Test
  public void shouldFactorialOf3Return6() {
    Factorial factorial = new Factorial() ;

    long expectedValue = 6 ;
    long obtainedValue = factorial.compute(3) ;

    assertEquals(expectedValue, obtainedValue) ;
  }

  @Test
  public void shouldFactorialOf4Return24() {
    Factorial factorial = new Factorial() ;

    long expectedValue = 24 ;
    long obtainedValue = factorial.compute(4) ;

    assertEquals(expectedValue, obtainedValue) ;
  }
}