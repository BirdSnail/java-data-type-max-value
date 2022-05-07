package com.bytelegend;
public class MaxValues {
    // byte类型能存储的最大值是？ 8位，有符号，[-2^7,2^7-1]
    // The maximum value a byte type can store
    public static byte maxByte = 127;

    // short类型能存储的最大值是？16位，有符号，[-2^15,2^15-1]
    // The maximum value a short type can store
    public static short maxShort = 32767; 

    // int类型能存储的最大值是？32位，有符号，[-2^31,2^31-1]
    // The maximum value an int type can store
    public static int maxInt = 2147483647;

    // long类型能存储的最大值是？64位，有符号，[-2^63,2^63-1], 以 L 结尾
    // The maximum value an long type can store
    public static long maxLong = 9223372036854775807L;

    // float类型能存储的最大值是？32位，单精度，[-Float.MAX_VALUE,Float.MAX_VALUE]
    // The maximum value an float type can store
    public static float maxFloat = Float.MAX_VALUE;

    // double类型能存储的最大值是？64位，双精度，[-Double.MAX_VALUE,Double.MAX_VALUE]
    // The maximum value an double type can store
    public static double maxDouble = Double.MAX_VALUE;

    // char类型能存储的最大值是？16位，Unicode字符，\u0000(十进制等效值0) ~ \uffff(十进制等效值65535)
    // The maximum value an char type can store
    public static char maxChar = 65535;

    public static void main(String[] args) {
        System.out.println("maxByte=" + maxByte);
        System.out.println("maxByte+1=" + (maxByte + 1));
        System.out.println("maxShort=" + maxShort);
        System.out.println("maxShort+1=" + (maxShort + 1));
        System.out.println("maxInt=" + maxInt);
        System.out.println("maxInt+1=" + (maxInt + 1));
        System.out.println("maxLong=" + maxLong);
        System.out.println("maxLong+1=" + (maxLong + 1));
        System.out.println("maxFloat=" + maxFloat);
        System.out.println("maxFloat+1=" + (maxFloat + 1));
        System.out.println("maxDouble=" + maxDouble);
        System.out.println("maxDouble+1=" + (maxDouble + 1));
        System.out.println("maxChar=" + maxChar);
        System.out.println("maxChar+1=" + (maxChar + 1));
    }
}
