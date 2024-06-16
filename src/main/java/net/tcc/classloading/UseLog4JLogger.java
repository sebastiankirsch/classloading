package net.tcc.classloading;

import java.util.Random;

import org.apache.log4j.Logger;

public class UseLog4JLogger extends Thread {

	private static final Random random = new Random();

	public UseLog4JLogger() {
		super("UseLog4JLogger");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(30 + random.nextInt(10));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
		Logger.getLogger(getClass()).info(getClass());
	}

}
