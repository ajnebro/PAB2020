package org.pab2020.mathUtils;

import java.math.BigInteger;

/**
 * This class implements a method to compute the factorial of an integer number.
 *
 * @author Antonio J. Nebro, Oleg Brezitskyy (@olegbrz)
 */
public class Factorial {
  public BigInteger compute(int value) {
    BigInteger result;
    BigInteger fact = BigInteger.valueOf(value);
    if (value < 0) {
      throw new RuntimeException("Negative number: " + value) ;
    } else if ((value == 0) || (value == 1)) {
      result = BigInteger.ONE;
    } else {
      result = fact.multiply(compute(value - 1));
    }

    return result;
  }
}
