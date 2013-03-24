package net.tcc.classloading.simplified;

public class BaseClass {

    static {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if (!Thread.currentThread().isInterrupted()) {
            System.out.println(SubClass.class);
        }
    }

}
