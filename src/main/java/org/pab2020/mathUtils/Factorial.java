package org.pab2020.mathUtils;

/**
 * This class implements a method to compute the factorial of an integer number.
 *
 * @author Antonio J. Nebro
 */
public class Factorial {
  public long compute(long value) {
    long result;
    if (value < 0) {
      throw new RuntimeException("Negative number: " + value) ;
    } else if ((value == 0) || (value == 1)) {
      result = 1;
    } else {
      result = value * compute(value - 1);
    }

    return result;
  }
}
