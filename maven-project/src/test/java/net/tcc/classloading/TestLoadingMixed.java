package net.tcc.classloading;

import org.junit.Test;

public class TestLoadingMixed {

	@Test
	public void test() {
		Thread[] threads = new Thread[] { new PriorityLoaderByClassForName(),
				new LevelLoaderByClassInstance() };

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
