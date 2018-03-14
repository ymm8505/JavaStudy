package proxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */

/**
 * 被代理角色
 */
public class HsqDog implements Dog{
    @Override
    public void jump() {
        System.out.println("hsq jump");
    }

    @Override
    public void wangwangwang() {
        System.out.println("aoaoao");
    }
}
