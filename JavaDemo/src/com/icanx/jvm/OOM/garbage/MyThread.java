package com.icanx.jvm.OOM.garbage;

import java.util.HashMap;

/**
 * Created by Yangmm on 2018-03-11.
 * 为赚钱撸代码
 * 为人民服务撸代码
 * 为中华之崛起撸代码
 */

public class MyThread extends Thread {
    HashMap<Long, byte[]> map = new HashMap<Long, byte[]>();
    @Override
    public void run() {
        try {
            while (true) {
                if (map.size() * 512 / 1024 / 1024 >= 450) {
                    System.out.println("=====准备清理=====:" + map.size());
                    map.clear();
                }

                for (int i = 0; i < 1024; i++) {
                    map.put(System.nanoTime(), new byte[512]);
                }

                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
