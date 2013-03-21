package net.tcc.classloading;

import org.junit.Test;

public class TestClassLoading {

	@Test
	public void test() {
		Thread[] threads = new Thread[] { new PriorityLoader(),
				new LevelLoader() };

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
