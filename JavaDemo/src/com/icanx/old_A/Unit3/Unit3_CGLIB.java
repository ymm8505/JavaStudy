package com.icanx.old_A.Unit3;

/**
    本章主要讨论字节码增强技术
 JDK proxy 代理  和CGLIB  利用ASM代理
 */

public class Unit3_CGLIB {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a+b;

        String name = "yangmm";

        byte[] name1 = name.getBytes();
        System.out.println(name1[0]);
//        System.out.println("c = " + c);
  }
}
