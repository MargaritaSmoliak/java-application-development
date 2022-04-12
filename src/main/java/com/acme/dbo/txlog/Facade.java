package com.acme.dbo.txlog;

public class Facade {
    public static final String PRIM_PREFIX = "primitive: ";

    public static void log(int message) {
        final String decoratedMessage = decorate(message);
        printMess(decoratedMessage);
    }

    public static void log(byte message) {
        final String decoratedMessage = decorate(message);
        printMess(decoratedMessage);
    }

   public static void log(char message) {
       final String decoratedMessage = "char: " + message;
       printMess(decoratedMessage);
    }

    public static void log(String message) {
        final String decoratedMessage = "string: " + message;
        printMess(decoratedMessage);
    }

    public static void log(boolean message) {
        final String decoratedMessage = "primitive: " + message; //decorate(message);
        printMess(decoratedMessage);
    }

    public static void log(Object message) {
        final String decoratedMessage = "reference: " + message;
        printMess(decoratedMessage);
    }

    private static void printMess(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }

    private static String decorate(int message) {
        return PRIM_PREFIX + message;
    }
}
