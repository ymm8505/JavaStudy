package com.icanx.jvm.OOM.garbage;

/**
 * Created by Yangmm on 2018-03-11.
 * 为赚钱撸代码
 * 为人民服务撸代码
 * 为中华之崛起撸代码
 */

public class PrintThread extends Thread {
    //开始时间
    public static final long startTime = System.currentTimeMillis();
    @Override
    public void run() {
        try {
            while (true) {
                long Time = System.currentTimeMillis() - startTime;
                System.out.println(Time);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
