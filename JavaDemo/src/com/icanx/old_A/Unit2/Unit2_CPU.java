package com.icanx.old_A.Unit2;

/**
本章主要讨论CPU 问题 和一些基本问题

 我自己的电脑 i5-4200M 处理器 2.5GHz主频
 CPU 是双核 四线程
 CPU缓存
 L1  一级缓存  128KB
 L2  二级缓存  512KB
 L3  三级缓存  3MB


 javap -verbose   运行该类


 "C:\Program Files\Java\jdk1.8.0_144\bin\javap.exe" -verbose Unit2_CPU
 Classfile /E:/MicService/GitHubResp/com.icanx.utils.Test/out/production/JavaStudy/com/icanx/old_A/Unit2_CPU.class
 Last modified 2018-3-12; size 824 bytes
 MD5 checksum 51965ce3994a0afa4d127637876b9bea
 Compiled from "Unit2_CPU.java"
 public class Unit2_CPU
 minor version: 0
 major version: 51
 flags: ACC_PUBLIC, ACC_SUPER
 Constant pool:                        【【【【【常量池】】】】】
 #1 = Methodref          #11.#29        // java/lang/Object."<init>":()V
 #2 = Fieldref           #30.#31        // java/lang/System.out:Ljava/io/PrintStream;
 #3 = Class              #32            // java/lang/StringBuilder
 #4 = Methodref          #3.#29         // java/lang/StringBuilder."<init>":()V
 #5 = String             #33            // c =
 #6 = Methodref          #3.#34         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 #7 = Methodref          #3.#35         // java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 #8 = Methodref          #3.#36         // java/lang/StringBuilder.toString:()Ljava/lang/String;
 #9 = Methodref          #37.#38        // java/io/PrintStream.println:(Ljava/lang/String;)V
 #10 = Class              #39            // com/icanx/old_A/Unit2_CPU
 #11 = Class              #40            // java/lang/Object
 #12 = Utf8               <init>
 #13 = Utf8               ()V
 #14 = Utf8               Code
 #15 = Utf8               LineNumberTable
 #16 = Utf8               LocalVariableTable
 #17 = Utf8               this
 #18 = Utf8               Lcom/icanx/old_A/Unit2_CPU;
 #19 = Utf8               main
 #20 = Utf8               ([Ljava/lang/String;)V
 #21 = Utf8               args
 #22 = Utf8               [Ljava/lang/String;
 #23 = Utf8               a
 #24 = Utf8               I
 #25 = Utf8               b
 #26 = Utf8               c
 #27 = Utf8               SourceFile
 #28 = Utf8               Unit2_CPU.java
 #29 = NameAndType        #12:#13        // "<init>":()V
 #30 = Class              #41            // java/lang/System
 #31 = NameAndType        #42:#43        // out:Ljava/io/PrintStream;
 #32 = Utf8               java/lang/StringBuilder
 #33 = Utf8               c =
 #34 = NameAndType        #44:#45        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 #35 = NameAndType        #44:#46        // append:(I)Ljava/lang/StringBuilder;
 #36 = NameAndType        #47:#48        // toString:()Ljava/lang/String;
 #37 = Class              #49            // java/io/PrintStream
 #38 = NameAndType        #50:#51        // println:(Ljava/lang/String;)V
 #39 = Utf8               com/icanx/old_A/Unit2_CPU
 #40 = Utf8               java/lang/Object
 #41 = Utf8               java/lang/System
 #42 = Utf8               out
 #43 = Utf8               Ljava/io/PrintStream;
 #44 = Utf8               append
 #45 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
 #46 = Utf8               (I)Ljava/lang/StringBuilder;
 #47 = Utf8               toString
 #48 = Utf8               ()Ljava/lang/String;
 #49 = Utf8               java/io/PrintStream
 #50 = Utf8               println
 #51 = Utf8               (Ljava/lang/String;)V
 {
 public Unit2_CPU();
 descriptor: ()V
 flags: ACC_PUBLIC
 Code:
 stack=1, locals=1, args_size=1
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return
 LineNumberTable:
 line 14: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       5     0  this   Lcom/icanx/old_A/Unit2_CPU;

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=3, locals=4, args_size=1
 0: iconst_1
 1: istore_1
 2: iconst_2
 3: istore_2
 4: iload_1
 5: iload_2
 6: iadd
 7: istore_3
 8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 11: new           #3                  // class java/lang/StringBuilder
 14: dup
 15: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
 18: ldc           #5                  // String c =
 20: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
 23: iload_3
 24: invokevirtual #7                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
 27: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
 30: invokevirtual #9                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 33: return
 LineNumberTable:
 line 16: 0
 line 17: 2
 line 18: 4
 line 20: 8
 line 21: 33
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0      34     0  args   [Ljava/lang/String;
 2      32     1     a   I
 4      30     2     b   I
 8      26     3     c   I
 }
 SourceFile: "Unit2_CPU.java"

 Process finished with exit code 0





 */

public class Unit2_CPU {
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
