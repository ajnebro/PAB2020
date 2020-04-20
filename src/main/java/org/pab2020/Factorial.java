package org.pab2020;

/**
 * Class to compute the factorial of an integer number
 *
 * @author Antonio J. Nebro
 */
public class Factorial {
  public long compute(long number) {
    long result;
    if ((number == 0) || (number == 1)) {
      result = 1;
    } else {
      result = number * compute(number - 1) ;
    }
    return result;
  }
}
