package methodFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */

/**
 * 工厂实体类
 */
public class PayWayFactorys {
    public static Pay buyer (PayFactory pf){
            Pay pay = pf.getPay();
            return pay;
    }
    public static PayFactory getWxPayFactory(){
        return new ZfbPayFactory();
    }
}
