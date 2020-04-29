package org.pab2020.parallel;

import org.pab2020.factorial.HeavyFactorial;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelFactorialWithFilter {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13) ;
    List<List<Long>> factorialValues ;
    HeavyFactorial factorial = new HeavyFactorial() ;

    long initTime = System.currentTimeMillis() ;

    factorialValues = numbers
            .parallelStream()
            .filter(number -> number%2 == 0)
            .map(number -> {
              System.out.println(number);
              return List.of(Long.valueOf(number), factorial.compute(number)) ;})
            .collect(Collectors.toList());

    long totalTime = System.currentTimeMillis() - initTime ;

    System.out.println("Total computing time: " + totalTime + " milliseconds") ;
    for (int i = 0; i < factorialValues.size(); i++) {
      System.out.println(factorialValues.get(i).get(0) + ": " + factorialValues.get(i).get(1)) ;
    }

    System.out.println("Number of factorial.compute() operations: " + factorial.getNumberOfComputeCalls()) ;
  }
}
