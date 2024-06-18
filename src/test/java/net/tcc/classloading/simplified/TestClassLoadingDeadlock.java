package net.tcc.classloading.simplified;

import net.tcc.classloading.BaseTest;
import org.junit.Test;


public class TestClassLoadingDeadlock extends BaseTest {

    @Test
    public void demonstrateSimplifiedScenario() {
        executeAndWaitForThreads(
                new BaseClassInstantiator(),
                new SubClassInstantiator());
    }

    public static void main(String[] args) {
        System.out.println("START");
        new TestClassLoadingDeadlock().demonstrateSimplifiedScenario();
        System.exit(0);
    }

}