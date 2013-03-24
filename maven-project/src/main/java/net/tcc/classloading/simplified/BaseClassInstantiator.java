package net.tcc.classloading.simplified;

import java.util.Random;
import java.util.logging.Level;

public class BaseClassInstantiator extends Thread {

    public BaseClassInstantiator() {
        super("BaseClassInstantiator");
    }

    @Override
    public void run() {
        System.out.println(new BaseClass());
    }

}
