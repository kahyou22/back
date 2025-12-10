package ch02_데이터와변수;

/**
 * 실수 (부동소수점)
 * 
 * 1. float: 4byte
 * 
 * 2. double: 8byte
 */
public class Ex06_실수 {

	public static void main(String[] args) {

		float var1 = .1234567890123456789f;
		double var2 = .1234567890123456789;
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
