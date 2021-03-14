package org.pab2020.mathUtils;

/**
 * This class implements a method to solve Rabbits and Recurrence Relations
 * at Rosalind.
 * @see <a href=http://rosalind.info/problems/fib/>http://rosalind.info/problems/fib/</a>
 * @author Oleg (@olegbrz)
 */
public class kFibonacci {
    public long compute(long n, long k) {
        long result;
        if ((n < 1) || (k < 1)) {
            throw new RuntimeException("Negative number: " + n) ;
        } else if ((n == 1) || (n == 2)) {
            result = 1;
        } else {
            result = compute(n-1, k) + k * compute(n - 2, k);
        }

        return result;
    }
}
