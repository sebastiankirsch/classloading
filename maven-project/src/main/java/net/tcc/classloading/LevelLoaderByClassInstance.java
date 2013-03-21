package net.tcc.classloading;

import java.util.logging.Level;

public class LevelLoaderByClassInstance extends Thread {

	public LevelLoaderByClassInstance() {
		super("LevelLoader");
	}

	@Override
	public void run() {
		System.out.println(Level.class);
	}

}
