package com.icanx.jvm;

/**
 * Created by Yangmm on 2018-03-10.
 * 为赚钱撸代码
 * 为人民服务撸代码
 * 为中华之崛起撸代码
 */

public class Parent {
    static {
        System.out.println("static block of Super class is initialized");
    }
    protected static   String familyName = "Lawson";
    {
        System.out.println("non static blocks in super class is initialized");
    }
}
