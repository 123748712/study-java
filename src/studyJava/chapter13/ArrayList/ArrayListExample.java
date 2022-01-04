package studyJava.chapter13.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // ArrayList< > 안에는 타입을 쓰지 않아도 된다.

		list.add("Java");			// String 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");  // 앞의 숫자는 인덱스의 번호를 지정하는 것. 먼저 add 해도 2번에 Database가 저장되고 밀려남.
		list.add("iBATIS");

		int size = list.size(); // 저장된 총 객체 수 얻기
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		String skill = list.get(2); // 2번 인덱스의 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) { // 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2); // 2번 인덱스 객체(Database) 삭제됨
		list.remove(2); // 2번 인덱스 객체(Servlet/JSP) 삭제됨

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
