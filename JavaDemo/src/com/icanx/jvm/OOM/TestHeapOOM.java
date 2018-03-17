package com.icanx.jvm.OOM;

import java.util.ArrayList;
import java.util.List;
/*

    默认值  不知道多少？如何获得当前对的大小



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

public class TestHeapOOM {
    private static int count = 0;
    public  static final byte[] Default_bytes = new byte[12*1024*1024];
    public static void main(String args[]) {
         List<String> list = new ArrayList<String>();
        while(true) {
//            System.out.print("Xmx=");
//            System.out.println(Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");
//            System.out.print("free mem=");
//            System.out.println(Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");
//            System.out.print("total mem=");
//            System.out.println(Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");
            list.add(("内存溢出啦~  内存溢出啦~~ 内存溢出啦~~~~").intern());
//            System.out.println(count++);
        }
    }
}
