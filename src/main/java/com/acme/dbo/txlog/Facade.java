package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.ConsolePrinter.printMess;
import static com.acme.dbo.txlog.Decorator.decorateMess;

public class Facade {
    private static int intAccumulator;
    private static String facadeState;
    private static String stringAccumulator;

    public static void log(int message) {
        if ("Sting State".equals(facadeState)) {
            flushString();
        }
        facadeState = "Int State";
        intAccumulator += message;
       // printMess(decorateMess(message));
    }

    private static void flushString() {
        printMess(decorateMess(stringAccumulator));
    }

    public static void log(byte message) {
       printMess(decorateMess(message));
    }

   public static void log(char message) {
       printMess(decorateMess(message));
    }

    public static void log(String message) {
        if ("Int State".equals(facadeState)) {
            flushInt();
        }
        printMess(decorateMess(message));
        facadeState = "String State";
        stringAccumulator = message;
    } else

    private static void flushInt() {
        printMess(decorateMess(intAccumulator));
        intAccumulator = 0;
    }

    public static void log(boolean message) {
        printMess(decorateMess(message));
    }

    public static void log(Object message) {
        printMess(decorateMess(message));
    }
}
