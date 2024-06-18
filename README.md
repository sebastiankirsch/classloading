classloading
============

A small test setup to demonstrate the issues described here: http://stackoverflow.com/questions/15543521/mixed-usage-of-log4j-and-commons-logging-causes-a-class-loading-deadlock

The three tests
[`TestMixedLoggerInstantiation`](src/test/java/net/tcc/classloading/TestMixedLoggerInstantiation.java),
[`TestLoadingByClassForName`](src/test/java/net/tcc/classloading/TestLoadingByClassForName.java) &
[`TestLoadingMixed`](src/test/java/net/tcc/classloading/TestLoadingMixed.java)
try to reconstruct said scenario.
The first close to real life, the other two by reducing it to the essence.  
A deadlock isn't produced often, and depending on the used hardware, may never occur.

Therefore, the test
[`TestClassLoadingDeadlock`](src/test/java/net/tcc/classloading/simplified/TestClassLoadingDeadlock.java)
is an even more simplified scenario reduced to the problem of a classloading deadlock.
This proved to be very likely in producing a deadlock (at least on my hardware).