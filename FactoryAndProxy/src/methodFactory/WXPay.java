package methodFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */

/**
 * 具体产品角色
 */
public class WXPay implements Pay {
    @Override
    public void pay() {
        System.out.println("WX Pay");
    }

    @Override
    public void payNum() {
        System.out.println("Wx Pay 4");
    }
}
