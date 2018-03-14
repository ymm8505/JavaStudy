package staticFactoryProxy;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/7
 */
public abstract class ModifyTradeFactory  {
    public static ModifyTrade getModifyTrade(){
        return new PhoneModifyTradeProxy(new PhoneModifyTrade());
    }
}
