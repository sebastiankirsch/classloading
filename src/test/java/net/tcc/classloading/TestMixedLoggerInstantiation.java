package net.tcc.classloading;

import org.junit.Test;

public class TestMixedLoggerInstantiation extends BaseTest {

    @Test
    public void reconstructRealLifeScenario() {
        executeAndWaitForThreads(
                new UseCommonsLoggingLogFactory(),
                new UseLog4JLogger());
    }

}
