package com.icanx.jvm.OOM;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/*

运行参数：-XX:PermSize=1M -XX:MaxPermSize=2M
-verbose -verbose:gc-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled

永久区域
-XX:PremSize               初始大小
-XX:MaxPremSize            最大可分配大小

使用CGLIB等库的时候，可能会产生大量的类，这些类，有可能撑爆永久区导致OOM

CGLIB 库 依赖ASM 导入JAR时 要注意版本匹配  否则报错

本次试验
CGLIB 3.1
ASM 4.2
*
* */

public class TestPerm {
    public static void main(String args[]) {
        while (true){
            createProxy(TestPerm.class);

            HashMap hashMap = new HashMap();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ThreadLocal<String> threadLocal = new ThreadLocal<String>();
            threadLocal.set("11111");
            threadLocal.get();
        }
    }

    public static Object createProxy(Class <?> targetClass) {
        Enhancer en = new Enhancer();
        en.setSuperclass(targetClass);  //传入的被代理类
        en.setUseCache(false);          // 关闭CGLib缓存，否则总是生成同一个类
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                return methodProxy.invokeSuper(o,args);
            }
        });               //
        return en.create();
    }

}
