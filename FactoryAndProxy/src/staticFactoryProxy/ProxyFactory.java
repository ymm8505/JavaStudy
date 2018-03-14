package staticFactoryProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */

/**
 * 静态代理类
 */
public class ProxyFactory {
    //目标类
    private Object modifyTrade;

    public ProxyFactory(Object modifyTrade1){
        this.modifyTrade = modifyTrade1;
    }

    static int  i = 0;
    public Object getModifyTradeProxy(){
          return Proxy.newProxyInstance(modifyTrade.getClass().getClassLoader(),
                  modifyTrade.getClass().getInterfaces(),
                  new InvocationHandler() {
                      @Override
                      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                          System.out.println("第"+(i++)+"次   方法名："+ method.getName());
//                          if(method.getName() .equals("changePhysicalCard")){
//                              System.out.println("1111");
//                          }
//                          System.out.println(args== null ? "无参数":args[0]);
                          Object ret = method.invoke(modifyTrade,args);
//                          if(method.getName() .equals("changePhysicalCard")){
//                              System.out.println("222");
//                          }
                        return ret;
                      }
                  });
    }

}
