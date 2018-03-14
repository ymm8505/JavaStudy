package proxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */

/**
 * 静态代理类
 */
public class DogProxy implements Dog{
    private Dog target;
    public DogProxy(Dog target){
        this.target = target;
    }

    @Override
    public void jump() {
        System.out.println("狗开始跳");
        target.jump();
        System.out.println("跳了1米");
    }

    @Override
    public void wangwangwang() {
        System.out.println("狗开始叫");
        target.wangwangwang();
        System.out.println("叫了三声");
    }
}
