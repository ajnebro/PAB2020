package org.pab2020.parallel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumNumbersWithCriticalSection {
  public void run() throws IOException {
    long initTime = System.currentTimeMillis() ;

    class Counter {
      private int counter = 0 ;

      public synchronized void compute() {
        counter = counter + 1 ;
      }

      public int getSum() {
        return counter ;
      }
    }

    Counter numberOfMaps = new Counter()  ;

    long numberOfLines = Files
            .lines(Paths.get("data/manyNumbers.txt"))
            .count();

    int sum = Files
            .lines(Paths.get("data/manyNumbers.txt"))
            .map(line -> {
              numberOfMaps.compute();
              return Integer.valueOf(line);
            })
            .reduce(0, Integer::sum) ;

    long totalTime = System.currentTimeMillis() - initTime ;

    System.out.println("Total computing time: " + totalTime + " milliseconds") ;

    System.out.println("Number of lines in the file: " + numberOfLines) ;
    System.out.println("Number of map operations: " + numberOfMaps.getSum()) ;
  }

  public static void main(String[] args) throws IOException {
    new SumNumbersWithCriticalSection().run(); ;
  }
}
