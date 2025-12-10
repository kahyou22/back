package ch02_데이터와변수;

/**
 * 
 */
public class Ex09_텍스트블록문법 {

	public static void main(String[] args) {

		String str1 = """
				A
				b""";
		String str2 = """
				""";
		String name = """
				A\
				b""";
		String job = "개발자";

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("name: " + name);
		System.out.println("job: " + job);
//		System.out.println("var5: " + var5);
	}

}
