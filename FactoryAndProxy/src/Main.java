import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
//       Pay a = PayWayFactorys.buyer(new WxPayFactory());
//        Pay b = PayWayFactorys.buyer(new ZfbPayFactory());
//        PayFactory zfbF = new ZfbPayFactory();
//        Pay ab = zfbF.getPay();
//        ab.pay();;
//
//        Person p = PersonFactory.getPersonInstance();
//        p.say();
//        Person p2 = PersonFactory.getPersonInstance();
//        System.out.println(p == p2);
//        Person p3 = Person.getPerson();
//        System.out.println(p3 == p2);
        String sf = "service=page/component.Navigation＆listener=opencontent＆title=手工收退费＆url=custserv?service=page/personalserv.handrecedefee.HandRecedeFee＆listener=initMobTrade＆listener=＆RIGHT_CODE=csHandRecedeFee＆staffId=baiss3＆departId=11b1jz1＆subSysCode=custserv＆eparchyCode=0010";
        System.out.println(sf.indexOf("&title="));
        System.out.println(sf.lastIndexOf("&url="));
        String title = URLDecoder.decode(sf.substring(sf.indexOf("&title=") + 7, sf.lastIndexOf("&url=")), "GBK");
        System.out.println(title);
    }
}
