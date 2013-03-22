package net.tcc.classloading;

import org.junit.Test;

public class TestMixedLoggerInstantiation {

	@Test
	public void test() {
		int numberOfThreads = 2;
		Thread[] threads = new Thread[numberOfThreads];
		for (int i = threads.length; i-- > 0;)
			threads[i] = i % 2 == 0 ? new UseCommonsLoggingLogFactory()
					: new UseLog4JLogger();

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
}
