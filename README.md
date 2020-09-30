# Java with Honey
This is a Java agent for auto instrumenting JVM applications and sending the events to Honeycomb.  Aka, @mipsytipsy's nightmare!

### How to build
1.  `javac src/main/java/tech/paika/JavaWithHoneyAgent.java`
1.  `jar -cfm target/JavaWithHoneyAgent.jar Manifest.txt src/main/java/tech/paika/JavaWithHoneyAgent.class`
