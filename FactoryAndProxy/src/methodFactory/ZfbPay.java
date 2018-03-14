package methodFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */

/**
 * 具体产品角色
 */
public class ZfbPay implements Pay{
    @Override
    public void pay() {
        System.out.println("ZFB Pay");
    }

    @Override
    public void payNum() {
        System.out.println("ZFB BUY 2");
    }
}
