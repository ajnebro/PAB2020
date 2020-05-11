package org.pab2020.factorial;

public class ConcurrentSum {
  private long sum = 0 ;

  public void compute() {
    synchronized (this) {
      sum = sum + 1;
    }
  }

  synchronized
  public void synchronizedCompute() {
    this.compute();
  }

  public long getSum() {
    return sum ;
  }
}
