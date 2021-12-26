package studyJava.chapter07.package05;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn(); // Phone 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone 메소드
	}
}
