package com.icanx.jvm.OOM;

import java.util.ArrayList;
import java.util.List;
/*

    默认值  不知道多少？如何获得当前栈的大小也没找到



* 栈的大小设置  -Xss   通常几百KB   没有最大最小设置 只有一个固定值
* -Xss：每个线程的堆栈大小。JDK5.0以后每个线程堆栈大小为1M,以前每个线程堆栈大小为256K。
* 应根据应用的线程所需内存大小进行适当调整。在相同物理内存下,减小这个值能生成更多的线程。
* 但是操作系统对一个进程内的线程数还是有限制的，不能无限生成，经验值在3000~5000左右。
* 一般小的应用， 如果栈不是很深， 应该是128k够用的，大的应用建议使用256k。
* 这个选项对性能影响比较大，需要严格的测试。
*
* 和threadstacksize选项解释很类似,官方文档似乎没有解释,
* 在论坛中有这样一句话:"-Xss is translated in a VM flag named ThreadStackSize”一般设置这个值就可以了。
*
* */

public class TestStackOOM {
    private static int count = 0;
    static List list = new ArrayList<Object>();

    public static void recursion(long a, long b, long c) {
        long e = 1, f = 2, g = 3, h = 4, i = 5, k = 6, q = 7, x = 8, y = 9, z = 10;
//		deep of calling = 2005    不注释上面的变量声明
//		deep of calling = 4521    注释掉上面的变量声明
//		java.lang.StackOverflowError
        count++;
        recursion(a, b, c);
    }


    public static void main(String args[]) {
       try {
            recursion(0L, 0L, 0L);
        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }
}
