package org.pab2020.parallel;

import org.pab2020.factorial.HeavyFactorial;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletionService;
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

    Comparator<List<Long>> comparator = (pair1, pair2) -> pair1.get(0).compareTo(pair2.get(0)) ;

    factorialValues
            .stream()
            .sorted(comparator.reversed())
            .forEach(pair -> System.out.println(pair.get(0) + ": " + pair.get(1)));

    //for (List<Long> factorialValue : factorialValues) {
    //  System.out.println(factorialValue.get(0) + ": " + factorialValue.get(1));
    //}

    System.out.println("Number of factorial.compute() operations: " + factorial.getNumberOfComputeCalls()) ;
  }
}
