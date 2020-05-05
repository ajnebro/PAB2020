package org.pab2020.parallel;

import org.pab2020.factorial.HeavyFactorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelFactorial {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16) ;
    List<Long> factorialValues ;
    HeavyFactorial factorial = new HeavyFactorial() ;

    long initTime = System.currentTimeMillis() ;

    int numberOfThreads = 1;
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "" + numberOfThreads);

    factorialValues = numbers
            .parallelStream()
            .map(factorial::compute)
            .collect(Collectors.toList());

    long totalTime = System.currentTimeMillis() - initTime ;

    System.out.println("Total computing time: " + totalTime + " milliseconds") ;
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i) + ": " + factorialValues.get(i)) ;
    }

    System.out.println("Number of factorial.compute() operations: " + factorial.getNumberOfComputeCalls()) ;
  }
}
