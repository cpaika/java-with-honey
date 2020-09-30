# Java with Honey
This is a Java agent for auto instrumenting JVM applications and sending the events to Honeycomb.  This is done as an exercise in learning how auto instrumentation in the JVM works.

Note:  This is a work in progress and currently is not integrating with Honeycomb.

### How to build
1.  `javac src/main/java/tech/paika/JavaWithHoneyAgent.java`
1.  `jar -cfm target/JavaWithHoneyAgent.jar Manifest.txt src/main/java/tech/paika/JavaWithHoneyAgent.class`
