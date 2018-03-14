package proxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */
public class Main {
    /** 静态代理优缺点
     * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
     2.缺点:

     因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
     如何解决静态代理中的缺点呢?答案是可以使用动态代理方式
     * @param args
     */
    public static void main(String args[]){
        Dog has = new HsqDog();
        Dog dogP = new DogProxy(has);
        dogP.jump();
        dogP.wangwangwang();
    }
}
