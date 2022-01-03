package studyJava.chapter10.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		/*
		 * 1. throws
		 * throws 키워드를 이용해 예외를 떠넘길 수 있는데 결국 JVM이 최종적으로 예외처리를 하게 된다.
		 */
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findClass() throws ClassNotFoundException { // 메서드 뒤에 throws 키워드를 이용한다.
		Class clazz = Class.forName("java.lang.String2");
	}
}