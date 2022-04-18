package com.acme.dbo.txlog;

public class Decorator {
    private static final String PRIM_PREFIX="primitive: ";
    private static final String CHAR_PREFIX="char: ";
    private static final String STRING_PREFIX="string: ";
    private static final String REF_PREFIX="reference: ";

    public static String decorateMess(int message){
        return PRIM_PREFIX + message;
    }

    public static String decorateMess(byte message){
        return PRIM_PREFIX + message;
    }

    public static String decorateMess(char message){
        return CHAR_PREFIX + message;
    }

    public static String decorateMess(String message){
        return STRING_PREFIX + message;
    }

    public static String decorateMess(boolean message){
        return PRIM_PREFIX + message;
    }

    public static String decorateMess(Object message){
        return REF_PREFIX + message;
    }
}
