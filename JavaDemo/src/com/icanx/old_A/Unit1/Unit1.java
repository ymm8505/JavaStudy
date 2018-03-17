package com.icanx.old_A.Unit1;

/**
本章主要讨论String 对象问题 和一些基本问题

 Integer类型 值比较
 127 == 127  true
 128 == 128 false

 -128 == -128  ture
 -129 == -129  false

 */

public class Unit1 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = -129;     // 127 == 127  true       128 == 128 false
        Integer i4 = -129;


        System.out.println("i1 == i2:" + (i1==i2));
        System.out.println("i3 == i4:" + (i3==i4));
    }
}
