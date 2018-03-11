package com.icanx.jvm.OOM.garbage;

/**

 3590
 3690
 3791
 3891
 3991
 4093
 4530
 5438
 =====准备清理=====:921944
 5605
 5705
 5805



 4.233: [GC4.233: [DefNew: 960K->63K(960K), 0.0024181 secs] 522133K->521732K(524224K), 0.0024596 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 4.237: [GC4.237: [DefNew: 959K->64K(960K), 0.0021254 secs] 522630K->522192K(524224K), 0.0021615 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 4.240: [GC4.240: [DefNew: 960K->64K(960K), 0.0020700 secs] 523088K->522596K(524224K), 0.0021016 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 4.244: [GC4.244: [DefNew: 960K->63K(960K), 0.0022326 secs] 523494K->523025K(524224K), 0.0022736 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 4.247: [GC4.247: [DefNew: 959K->959K(960K), 0.0000107 secs]
 4.247: [Tenured: 522963K->523263K(523264K), 0.3815009 secs] 523923K->523622K(524224K), [Perm : 267K->267K(12288K)], 0.3815838 secs] [Times: user=0.38 sys=0.00, real=0.38 secs]
 4.630: [Full GC4.630: [Tenured: 523263K->523263K(523264K), 0.3945070 secs] 524159K->523985K(524224K), [Perm : 267K->267K(12288K)], 0.3945575 secs] [Times: user=0.39 sys=0.00, real=0.39 secs]
 5.025: [Full GC5.025: [Tenured: 523263K->515693K(523264K), 0.5116150 secs] 523985K->515693K(524224K), [Perm : 267K->267K(12288K)], 0.5116651 secs] [Times: user=0.52 sys=0.00, real=0.51 secs]
 5.540: [GC5.540: [DefNew: 896K->64K(960K), 0.0016479 secs] 516590K->516182K(524224K), 0.0016878 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 5.544: [GC5.544: [DefNew: 960K->64K(960K), 0.0022539 secs] 517080K->516685K(524224K), 0.0022974 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 5.547: [GC5.547: [DefNew: 960K->63K(960K), 0.0019370 secs] 517582K->517123K(524224K), 0.0019743 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]


 上面是时间输出。
 下面是GC的工作输出 基本吻合。

 */

public class TestGCStopInWord {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("MyThread");
        PrintThread pt = new PrintThread();
        pt.setName("PrintThread");
        mt.start();
        pt.start();
    }

}
