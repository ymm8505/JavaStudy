package methodFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */

/**
 * 工厂类
 */
public class ZfbPayFactory implements PayFactory {
    @Override
    public Pay getPay() {
        return new ZfbPay();
    }
}
