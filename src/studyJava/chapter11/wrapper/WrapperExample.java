package studyJava.chapter11.wrapper;

public class WrapperExample {
	public static void main(String[] args) {
		Integer integer = new Integer(10); // 10 이라는 정수를 integer로 boxing 한 것.
		int intValue = integer.intValue(); // 10 이라는 정수를 unboxing 한 것.

		Integer i = 10; // auto boxing
		int j = i; // auto unboxing
		
		// 객체는 데이터를 가질
	}
}
