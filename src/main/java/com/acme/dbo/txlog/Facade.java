package com.acme.dbo.txlog;

import static com.acme.dbo.txlog.ConsolePrinter.printMess;
import static com.acme.dbo.txlog.Decorator.decorateMess;

public class Facade {
     public static void log(int message) {
        printMess(decorateMess(message));
    }

   public static void log(byte message) {
       printMess(decorateMess(message));
    }

   public static void log(char message) {
       printMess(decorateMess(message));
    }

    public static void log(String message) {
        printMess(decorateMess(message));
    }

    public static void log(boolean message) {
        printMess(decorateMess(message));
    }

    public static void log(Object message) {
        printMess(decorateMess(message));
    }
}
