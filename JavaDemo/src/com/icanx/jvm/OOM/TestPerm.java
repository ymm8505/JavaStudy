package com.icanx.jvm.OOM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
/*


dk版本：1.6.0_38
运行参数：-XX:PermSize=4M -XX:MaxPermSize=4M
-verbose -verbose:gc-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled

永久区域
-XX:PremSize               初始大小
-XX:MaxPremSize            最大可分配大小

使用CGLIB等库的时候，可能会产生大量的类，这些类，有可能撑爆永久区导致OOM



*
* */

public class TestPerm {
    public static void main(String args[]) {
//        for(int i=0;i<100000;i++){
//            TestPerm bean = new TestPerm("com.icanx.jvm.OOM.TestPerm"+i,new HashMap());
//        }

        Random rnd = new Random();
        List<String> interned = new ArrayList<String>();
        for (; ; ) {
            int length = rnd.nextInt(100);
            StringBuilder builder = new StringBuilder();
            String chars = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < length; i++) {
                builder.append(chars.charAt(rnd.nextInt(chars.length())));
            }
            interned.add(builder.toString().intern());
        }
    }
}
