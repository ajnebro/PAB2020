package org.pab2020.parallel;

public class ConcurrentCounter {
  private long counter = 0;

  public synchronized void compute() {
    counter = counter + 1;
  }

  public long getCounter() {
    return counter;
  }




















/*






  synchronized
  public void synchronizedCompute() {
    this.compute();
  }
*/

}
