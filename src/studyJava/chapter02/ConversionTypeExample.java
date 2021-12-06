package studyJava.chapter02;

public class ConversionTypeExample {
	public static void main(String[] args) {

		// 1. 자동 타입 변환 (promotion)
		// 큰 허용 범위 타입 = 작은 허용 범위 타입
		// byte < short < char < int < long < float < double

		byte byteValue = 10;
		int intValue = byteValue; // byte < int

		System.out.println("intValue : " + intValue);

		char charValue = '가';
		intValue = charValue;

		System.out.println("가 의 유니코드 : " + intValue); // char < int

		intValue = 50;
		long longValue = intValue; // int < long

		System.out.println("longValue : " + longValue);

		longValue = 100;
		float floatValue = longValue; // long < float

		System.out.println("floatValue : " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue; // float < double

		System.out.println("doubleValue : " + doubleValue);

		
		// 2. 강제 타입 변환 (casting)
		// 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입

		int intValue2 = 44032;
		char charValue2 = (char) intValue2; // int > char

		System.out.println(charValue2);

		long longValue2 = 500; // long > int
		intValue2 = (int) longValue2;

		System.out.println(intValue2);

		double doubleValue2 = 3.14; // double > int
		intValue2 = (int) doubleValue2;

		System.out.println(intValue2);
	}
}
