package staticFactoryProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/8
 */

/**
 * JDK 方式  实现动态代理  需要有 实现InvocationHandler 的内部类 作为参数
 */
public class TestInvocationHanddler implements InvocationHandler{
    private Object object;
    public TestInvocationHanddler(Object o){
        this.object = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
