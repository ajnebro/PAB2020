package org.pab2020.factorial;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentSumTest {

  @Test
  public void shouldComputeProduceTheDesiredResultWhenCalledSequentially() {
    ConcurrentSum concurrentSum = new ConcurrentSum() ;
    IntStream.range(0, 10000).forEach(i -> concurrentSum.compute());

    assertEquals(10000, concurrentSum.getSum()) ;
  }

  @Test
  public void shouldComputeDoNotProduceTheDesiredResultWhenCalledInParallel() {
    ConcurrentSum concurrentSum = new ConcurrentSum() ;

    //ExecutorService executorService = Executors.newFixedThreadPool(1) ;
    //IntStream.range(0, 10000).forEach(counter -> executorService.submit(concurrentSum::compute));
    IntStream.range(0, 1000).parallel().forEach(counter -> concurrentSum.compute());

    assertNotEquals(1000, concurrentSum.getSum()) ;
  }

  @Test
  public void shouldSynchronizedComputeProduceTheDesiredResultWhenCalledInParallel() {
    ConcurrentSum concurrentSum = new ConcurrentSum() ;

    //ExecutorService executorService = Executors.newFixedThreadPool(1) ;
    //IntStream.range(0, 10000).forEach(counter -> executorService.submit(concurrentSum::compute));
    IntStream.range(0, 1000).parallel().forEach(counter -> concurrentSum.synchronizedCompute());

    assertEquals(1000, concurrentSum.getSum()) ;
  }

}