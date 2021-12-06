package studyJava.chapter02;

public class StringConversionExample {
	public static void main(String[] args) {

		// 1. + ���꿡���� ���ڿ� �ڵ� Ÿ�� ��ȯ
		// ���� + ���� = ����
		// "���ڿ�" + ���� = "���ڿ�����"
		// ���� + "���ڿ�" = "���ڹ��ڿ�"

		// ���� ����
		int value = 10 + 2 + 8;
		System.out.println("value : " + value);

		// ���ڿ� ���� ����

		String str1 = 10 + 2 + "8"; // 10 + 2 �� ���� ���Ǿ� 12 + "8" �� ���߿� ���ȴ�.
		System.out.println("str1 : " + str1);

		String str2 = 10 + "2" + 8; // 10�� ���ڿ� "2" �� ���� �� �ٽ��ѹ� ���ڿ� 102�� ���� 8�� ���ȴ�.
		System.out.println("str2 : " + str2);

		// 2. ���ڿ��� �⺻Ÿ������ ���� Ÿ�� ��ȯ

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