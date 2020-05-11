package org.pab2020.factorial;

/**
 * Class to compute the factorial of an integer number
 *
 * @author Antonio J. Nebro
 */
public class HeavyFactorial extends Factorial {
  @Override
  public long compute(long value) {
    for (long i = 0 ; i < 100000000 ; i++) {
      double dummy = Math.sin(2.3 + i) * Math.cos(i) ;
    }

    return super.compute(value) ;
  }
}
