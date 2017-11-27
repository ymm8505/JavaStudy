import java.math.BigDecimal;


public class TestM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(0.06+0.01);
	        System.out.println(1.0-0.42);
	        System.out.println(4.015*100);
	        System.out.println(303.1/1000);
	        
	        BigDecimal one = new BigDecimal("0.06");
	        BigDecimal two = new BigDecimal("0.01");
	        System.out.println(one.add(two));
	        System.out.println(one.subtract(two));
	        System.out.println(one.multiply(two));
	        System.out.println(one.divide(two));
	        
	}

}
