package studyJava.chapter11.stringMethod;

public class StringSubStringExample {
	public static void main(String[] args) {
		// String �޼ҵ� �������� -5
		// ���ڿ� �߶󳻱� (substring())

		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // �־��� ���۰� �� �ε��� ������ ���ڿ� ���� ���
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // �־��� �ε������� ������ ���ڿ� ���� ���
		System.out.println(secondNum);
		
	}
}
