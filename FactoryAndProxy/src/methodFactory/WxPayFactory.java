package methodFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */
public class WxPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new WXPay();
    }
}
