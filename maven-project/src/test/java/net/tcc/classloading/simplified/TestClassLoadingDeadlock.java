package net.tcc.classloading.simplified;

import org.junit.Test;


public class TestClassLoadingDeadlock {
  @Test
  public void test() {
    Thread[] threads = new Thread[] {
      new BaseClassInstantiator(),
      new SubClassInstantiator()
    };

    for (Thread t : threads) {
      t.start();
    }

    for (Thread t : threads) {
      try {
        t.join();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("START");
    new TestClassLoadingDeadlock().test();
  }
}
