package com.icanx.jvm;

/**
 * Created by Yangmm on 2018-03-10.
 * 为赚钱撸代码
 * 为人民服务撸代码
 * 为中华之崛起撸代码
 */

public class ClassInitializationTest {
    public static void main(String args[]) throws InterruptedException {

        NotUsed o = null;       //this class is not used, should not be initialized
//        Child t = new Child(); //initializing sub class, should trigger super class initialization
//        System.out.println((Object)o == (Object)t);
                System.out.println(Child.familyName);
    }
}
