package net.tcc.classloading;

public class LevelLoaderByClassForName extends Thread {

	public LevelLoaderByClassForName() {
		super("LevelLoader");
	}

	@Override
	public void run() {
		try {
			System.out.println(Class.forName("org.apache.log4j.Level"));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
