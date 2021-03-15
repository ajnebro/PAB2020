package org.pab2020.mathUtils;

import java.util.HashMap;

/**
 * This class implements a method to solve Rabbits and Recurrence Relations
 * at Rosalind.
 *
 * The method compute() was improved with top-down dynamic programming approach
 * which reduced significantly the CPU time:
 *      [Approach]      [Parameters used]    [3 CPU times (random executing)]
 *      Recursive   ->  (n = 40, k = 5)   -> 304 ms , 294 ms, 291 ms.
 *      Top-down DP ->  (n = 40, k = 5)   -> 0 ms, 1 ms, 1 ms.
 *
 * @see <a href=http://rosalind.info/problems/fib/>http://rosalind.info/problems/fib/</a>
 * @author Oleg (@olegbrz)
 */
public class kFibonacci {
    public HashMap<Long, Long> cache = new HashMap<Long, Long>();

    public long compute(long n, long k) {
        long result;
        if ((n < 1) || (k < 1)) {
            throw new RuntimeException("Negative number: " + n) ;
        } else if ((n == 1) || (n == 2)) {
            result = 1;
        } else if (cache.containsKey(n)){
            return cache.get(n);
        } else {
            result = compute(n-1, k) + k * compute(n - 2, k);
            cache.put(n, result);
        }

        return result;
    }
}
