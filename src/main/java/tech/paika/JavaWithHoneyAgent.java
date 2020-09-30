package tech.paika;

import java.lang.instrument.Instrumentation;

public class JavaWithHoneyAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        //TODO replace with SLF4J
        System.out.println("Initializing JavaWithHoney agent");
    }
}