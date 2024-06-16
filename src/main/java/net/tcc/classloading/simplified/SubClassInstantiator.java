package net.tcc.classloading.simplified;

public class SubClassInstantiator extends Thread {

    public SubClassInstantiator() {
        super("SubClassInstantiator");
    }

    @Override
    public void run() {
        System.out.println(new SubClass());
    }

}
