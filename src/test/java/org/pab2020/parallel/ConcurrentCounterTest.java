package org.pab2020.parallel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentCounterTest {

  @Test
  public void shouldGetCounterReturnTheDesiredResultWhenComputeIsCalledSequentially() {
    ConcurrentCounter concurrentCounter = new ConcurrentCounter();
    IntStream.range(0, 1000)
            .forEach(i -> concurrentCounter.compute());

    assertEquals(1000, concurrentCounter.getCounter());
  }

  @Test
  public void shouldGetCounterDoNotProduceTheDesiredResultWhenComputedIsCalledInParallel() {
    ConcurrentCounter concurrentCounter = new ConcurrentCounter();

    IntStream.range(0, 1000)
            .parallel()
            .forEach(counter -> concurrentCounter.compute());

    assertEquals(1000, concurrentCounter.getCounter());
  }
}