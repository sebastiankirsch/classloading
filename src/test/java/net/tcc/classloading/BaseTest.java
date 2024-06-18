package net.tcc.classloading;

import static org.junit.Assume.assumeTrue;

/**
 * Base class with which to reconstruct a deadlock situation by running multiple threads in parallel.
 */
public abstract class BaseTest {

    protected void executeAndWaitForThreads(Thread... threads) {
        soutStart(threads);
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            try {
                t.join(1024);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            assumeTrue("Couldn't produce a deadlock!", t.isAlive());
        }
        System.out.println("+++ Deadlock achieved! +++");
        for (Thread t : threads) {
            System.out.println("Thread [" + t.getName() + "]:");
            for (StackTraceElement e : t.getStackTrace()) {
                System.out.println(e.getClassName() + "." + e.getMethodName() + "(" + e.getFileName() + ":" + e.getLineNumber() + ")");
            }
        }
    }

    private void soutStart(Thread[] threads) {
        StringBuilder stringBuilder = new StringBuilder("Starting threads [");
        for (Thread t : threads) {
            stringBuilder.append(t.getName()).append(",");
        }
        stringBuilder.replace(stringBuilder.length() - 1, stringBuilder.length(), "]...");
        System.out.println(stringBuilder);
    }

}
