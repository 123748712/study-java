package studyJava.chapter06;

public class Person {
	String name;
	String address;
	String phoneNumber;
	int age;
	
	// 다른 생성자 호출 (this)

	Person() {

	}

	Person(String name) {  // 호출
		this(name, "대전", "010-1234-5678", 21);
	}

	Person(String name, String address) {  // 호출
		this(name, address, "010-1234-5678", 21);
	}

	Person(String name, String address, String phoneNumber) {  // 호출
		this(name, address, phoneNumber, 21);
	}
	Person(String name, String address, String phoneNumber, int age) {  // 공통 실행 코드
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

}
