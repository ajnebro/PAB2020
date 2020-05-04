package org.pab2020.parallel;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperations {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(7, 3, 4, 2, 6, 6, 10, 9, 10, 11, 10, 13, 5, 1) ;

    double count = numbers.stream().count() ;
    int max = numbers.stream().max((a,b) -> a.compareTo(b)).get() ;
    int min = numbers.stream().min((a,b) -> a.compareTo(b)).get() ;
    int first = numbers.stream().findFirst().get() ;
    List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

    System.out.println("Count: " + count) ;
    System.out.println("Max:   " + max) ;
    System.out.println("Min:   " + min) ;
    System.out.println("First: " + first) ;
    distinctNumbers.forEach(System.out::println);
  }
}
