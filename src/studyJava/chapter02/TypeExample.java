package studyJava.chapter02;

public class TypeExample {
	public static void main(String[] args) {
		// �ڹٴ� ����, �Ǽ�, ������ ������ �� �ִ� �⺻Ÿ���� �����Ѵ�.
		// ����Ÿ�� : byte, char, short, int, long
		// �Ǽ�Ÿ�� : float, double
		// ��Ÿ�� : boolean

		
		// 1. int Ÿ�� ���� ���� �� ��� ���		

		int var1 = 0b1011; 	// 2����
		int var2 = 0206;	// 8����
		int var3 = 365; 	// 10����
		int var4 = 0xB3;	// 16����

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		// 2. byte Ÿ�� ���� ���� �� ���		
		
		byte var5 = -128;
		byte var6 = -30;
		byte var7 = 0;
		byte var8 = 127;
		// byte Ÿ���� -128 ~ 127 ���� ����Ѵ�.
		// byte var = 128 �� �����Ͽ����� �߻��Ѵ�.
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);

		
		// 3. long Ÿ�� ���� ���� �� ��� ���

		// long balance = 30000000000 �� ������ ������ ����.
		// ��, long Ÿ������ �����Ϸ����� �˷��ֱ� ���� ���ͷ� �ڿ� �ҹ��� l , �빮�� L �� �ڿ� �����ָ� �ȴ�.

		long balance = 30000000000L;
		
		System.out.println(balance);
		
		
		// 3. char Ÿ�� ���� ���� �� ���
		
		// char Ÿ���� ��������ǥ�� ���� �ϳ��� ���ڸ� ����Ѵ�.
		
		char var9 = 'A'; 		// ���ڸ� ���� ����
		char var10 = 65;  		// 10������ ����
		char var11 = '\u0041';  // 16������ ����
	
		System.out.println(var9);
		System.out.println(var10);
		System.out.println(var11);
		
		int var12 = 'A';  // ���ܷ� int�� �����ϸ� �����ڵ尪�� ����Ѵ�.
		
		System.out.println(var12);
		
		
		// 4. String Ÿ�� ���� ���� �� ���
		
		// String Ÿ���� Ŭ���� Ÿ���̴�.
		// ū����ǥ�� ���� ���ڿ��̸� ��������(\) �� ���� �̽������� ���ڸ� ����� �� �ִ�.
		
		String name = "ȫ�浿";
		String job = "���α׷���";
		
		System.out.println("�̸���\n " + name + "�Դϴ�."); // �ٹٲ�
		System.out.println("������/t " + job + "�Դϴ�.");  // �� ũ�⸸ŭ ���
		
		
		// 5. �Ǽ� Ÿ���� float �� double Ÿ�� ���� ���� �� ���
		
		// �Ǽ��� ����
	
		//float var = 3.14 �� ������ ������ ����.
		//float Ÿ������ �����Ϸ����� �˸����� �ҹ��� f, �빮�� F �� �ڿ� �����ָ� �ȴ�.
	
		float var13 = 3.14f;
		double var14 = 3.14;
		
		// ���е� �׽�Ʈ
		
		float var15 = 0.1234567890123456789f;
		double var16 = 0.1234567890123456789;
		
		System.out.println(var13);
		System.out.println(var14);
		System.out.println(var15); 
		System.out.println(var16);  // double Ÿ���� var16 �� float Ÿ���� var15 ���� 2�� �̻� ������ ���� ����Ѵ�.
		
		
		// 6. �� Ÿ���� boolean Ÿ��
		
		// �ַ� ���ǹ��� ����� ���� �帧�� �����ϴµ� ����Ѵ�.
		boolean stop = true;
		if(stop) {
			System.out.println("�����մϴ�."); // boolean stop�� ���� true ���̱� ������ �����մϴ�. �� ����Ѵ�.
		} else {
			System.out.println("�����մϴ�.");
		}
	
	}
}
