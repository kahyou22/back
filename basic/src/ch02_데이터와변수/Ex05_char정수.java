package ch02_데이터와변수;

/**
 * 정수
 * 
 * 1. byte: 1byte
 * 
 * 2. short / char: 2byte
 * 
 * 3. int: 4byte
 * 
 * 4. long: 8byte
 */
public class Ex05_char정수 {

	public static void main(String[] args) {

		char var1 = 'A';
		char var2 = '가';
		char var3 = 65;
		char var4 = 44032;
		char var5 = 0x0041;

		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}

}
