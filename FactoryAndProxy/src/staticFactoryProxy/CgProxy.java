package staticFactoryProxy;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/8
 */

/**
 * 通过CGLib 实现动态代理  不需要实现接口  但是代理类必须实现 MethodInterceptor
 */
public class CgProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        System.out.println("1111");
        Object b = methodProxy.invokeSuper(o,objects);
        System.out.println("1111");
        return method.invoke(o,objects);

    }
}
