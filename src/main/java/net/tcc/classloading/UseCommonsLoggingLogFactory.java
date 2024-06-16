package net.tcc.classloading;

import org.apache.commons.logging.LogFactory;

public class UseCommonsLoggingLogFactory extends Thread {

	public UseCommonsLoggingLogFactory() {
		super("UseCommonsLoggingLogFactory");
	}

	@Override
	public void run() {
		LogFactory.getLog(getClass()).info(getClass());
	}

}
