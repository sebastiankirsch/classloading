package net.tcc.classloading;

import org.junit.Test;

public class TestLoadingByClassForName extends BaseTest {

    @Test
    public void loadBothClassesByName() {
        executeAndWaitForThreads(
                new PriorityLoaderByClassForName(),
                new LevelLoaderByClassForName());
    }

}
