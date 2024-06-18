package net.tcc.classloading;

import org.junit.Test;

public class TestLoadingMixed extends BaseTest {

    @Test
    public void loadOneClassByNameAndOneByReference() {
        executeAndWaitForThreads(
                new PriorityLoaderByClassForName(),
                new LevelLoaderByClassInstance());
    }

}
