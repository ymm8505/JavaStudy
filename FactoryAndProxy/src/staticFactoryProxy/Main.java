package staticFactoryProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */
public class Main {
    public static void main(String[] args) throws Throwable {
//        ModifyTrade modi = ModifyTradeFactory.getModifyTrade();
//        modi.changeCustomerName();
//        ModifyTrade pmtp = ModifyTradeFactory.getModifyTrade();
//        pmtp.changeCustomerName();
//        pmtp.changePhysicalCard();
//        ModifyTrade pmtp = new PhoneModifyTrade();
////        ProxyFactory p = new ProxyFactory(pmtp);
//        ProxyFactory po = new ProxyFactory(pmtp);
//        ModifyTrade m = (ModifyTrade) po.getModifyTradeProxy();
//        m.changePhysicalCard("aaaaa");
//        m.changeCustomerName();

//        PhoneModifyTrade pmt = new PhoneModifyTrade();
//        Method m1 = pmt.getClass().getMethods()[0];
//        TestInvocationHanddler t = new TestInvocationHanddler(pmt);
//        t.invoke(pmt,m1,null);

//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "F:\\code");
        Enhancer en = new Enhancer();
        en.setSuperclass(PhoneModifyTrade.class);
        en.setCallback(new CgProxy());
        PhoneModifyTrade ppp =(PhoneModifyTrade) en.create();
        ppp.changeCustomerName();
    }
}
