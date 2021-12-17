package studyJava.chapter06;

public class PersonExample {
	public static void main(String[] args) {

		Person person1 = new Person("김자바");
		System.out.println(person1.name);

		Person person2 = new Person("박자바", "서울");
		System.out.println(person2.name);
		System.out.println(person2.address);

		Person person3 = new Person("정자바", "대전", "010-1234-5678");
		System.out.println(person3.name);
		System.out.println(person3.address);
		System.out.println(person3.phoneNumber);
		
		Person person4 = new Person("한자바", "부산", "010-9876-5432", 21);
		System.out.println(person4.name);
		System.out.println(person4.address);
		System.out.println(person4.phoneNumber);
		System.out.println(person4.age);

	}
}
