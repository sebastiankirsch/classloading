package net.tcc.classloading;

public class PriorityLoaderByClassForName extends Thread {

	public PriorityLoaderByClassForName() {
		super("PriorityLoader");
	}

	@Override
	public void run() {
		try {
			System.out.println(Class.forName("org.apache.log4j.Priority"));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
