package staticFactoryProxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */

/**
 * 静态代理类
 */
public class PhoneModifyTradeProxy implements ModifyTrade {

    private ModifyTrade mtf1;

    public PhoneModifyTradeProxy(ModifyTrade mtf){
        this.mtf1 = mtf;
    }
    @Override
    public void changePhysicalCard(String name) {
        System.out.println("判断有没有剩下的SIM card");
        mtf1.changePhysicalCard(name);
        System.out.println("删除已用SIM 卡");
    }

    @Override
    public void changeCustomerName() {
        System.out.println("判断有没有此用户");
        mtf1.changeCustomerName();
        System.out.println("成功");
    }
}
