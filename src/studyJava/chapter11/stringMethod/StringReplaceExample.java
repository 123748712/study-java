package studyJava.chapter11.stringMethod;

public class StringReplaceExample {
public static void main(String[] args) {
	// String �޼ҵ� �������� -4
	// ���ڿ� ��ġ�ϱ� (replace())
	
	String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API �� �����մϴ�.";
	String newStr = oldStr.replace("�ڹ�", "JAVA"); // ù��° �Ű����� ���ڿ��� ã�� �ι��� �Ű����� ���ڿ��� ��ġ�� �����ϰ� �����Ѵ�.
	System.out.println(oldStr); // ���� ��
	System.out.println(newStr); // ���� ��
}
}
