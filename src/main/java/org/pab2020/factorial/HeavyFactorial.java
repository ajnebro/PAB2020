package org.pab2020.factorial;

/**
 * Class to compute the factorial of an integer number
 *
 * @author Antonio J. Nebro
 */
public class HeavyFactorial extends Factorial {
  private int numberOfComputeCalls = 0 ;

  @Override
  public long compute(long value) {
    for (long i = 0 ; i < 20000000 ; i++) {
      double dummy = Math.sin(2.3 + i) * Math.cos(i) ;
    }

    numberOfComputeCalls += 1 ;

    return super.compute(value) ;
  }

  public int getNumberOfComputeCalls() {
    return numberOfComputeCalls ;
  }
}
