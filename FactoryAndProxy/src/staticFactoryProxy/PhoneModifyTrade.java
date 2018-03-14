package staticFactoryProxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */

/**
 * 被代理类
 */
public class PhoneModifyTrade implements ModifyTrade {
    @Override
    public void changePhysicalCard(String name) {
        System.out.println("手机修改SIm Card"+name);
    }

    @Override
    public void changeCustomerName() {
        System.out.println("手机修改 用户名称");
    }
}
