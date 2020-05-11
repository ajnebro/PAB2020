package org.pab2020.factorial;

/**
 * Class to compute the factorial of an integer number
 *
 * @author Antonio J. Nebro
 */
public class Factorial {
  public long compute(long number) {
    long result;

    if (number < 0) {
      throw new RuntimeException("The number is negative") ;
    } else if ((number == 0) || (number == 1)) {
      result = 1;
    } else {
      result = 1 ;
      for (int i = 2; i <= number; i++)  {
        result = result * i ;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial() ;

    System.out.println(factorial.compute(5)) ;
  }
}
