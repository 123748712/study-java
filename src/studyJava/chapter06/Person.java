package studyJava.chapter06;

public class Person {
	String name;
	String address;
	String phoneNumber;
	int age;
	
	// �ٸ� ������ ȣ�� (this)

	Person() {

	}

	Person(String name) {  // ȣ��
		this(name, "����", "010-1234-5678", 21);
	}

	Person(String name, String address) {  // ȣ��
		this(name, address, "010-1234-5678", 21);
	}

	Person(String name, String address, String phoneNumber) {  // ȣ��
		this(name, address, phoneNumber, 21);
	}
	Person(String name, String address, String phoneNumber, int age) {  // ���� ���� �ڵ�
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

}
