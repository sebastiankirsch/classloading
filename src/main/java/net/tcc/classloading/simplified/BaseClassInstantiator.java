package net.tcc.classloading.simplified;

public class BaseClassInstantiator extends Thread {

    public BaseClassInstantiator() {
        super("BaseClassInstantiator");
    }

    @Override
    public void run() {
        System.out.println(new BaseClass());
    }

}
