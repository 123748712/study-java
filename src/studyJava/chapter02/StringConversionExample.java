package studyJava.chapter02;

public class StringConversionExample {
	public static void main(String[] args) {

		// 1. + 연산에서의 문자열 자동 타입 변환
		// 숫자 + 숫자 = 숫자
		// "문자열" + 숫자 = "문자열숫자"
		// 숫자 + "문자열" = "숫자문자열"

		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);

		// 문자열 결합 연산

		String str1 = 10 + 2 + "8"; // 10 + 2 가 먼저 계산되어 12 + "8" 이 나중에 계산된다.
		System.out.println("str1 : " + str1);

		String str2 = 10 + "2" + 8; // 10과 문자열 "2" 가 계산된 후 다시한번 문자열 102와 숫자 8이 계산된다.
		System.out.println("str2 : " + str2);

		// 2. 문자열을 기본타입으로 강제 타입 변환

		// String -> byte
		String str3 = "10";
		byte Bytevalue = Byte.parseByte(str3);
		System.out.println(str3);

		// String -> short
		String str4 = "200";
		short shortValue = Short.parseShort(str4);
		System.out.println(str4);

		// String -> int
		String str5 = "300000";
		int intValue = Integer.parseInt(str5);
		System.out.println(str5);

		// String -> long
		String str6 = "4000000000";
		long longValue = Long.parseLong(str6);
		System.out.println(str6);
		
		// String -> float
		String str7 = "12.345";
		float floatValue = Float.parseFloat(str7);
		System.out.println(str7);
		
		// String -> double
		String str8 = "12.345";
		double doubleValue = Double.parseDouble(str8);
		System.out.println(str8);
		
		// String -> boolean
		String str9 = "true";
		boolean booleanValue = Boolean.parseBoolean(str9);
		System.out.println(str9);
	}
}