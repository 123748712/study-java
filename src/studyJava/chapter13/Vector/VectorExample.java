package studyJava.chapter13.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/*
		 * 1. Vector
		 * Vector도 ArrayList와 같은 내부 구조를 가지고 있다.
		 * 다른점은 동기화된 메소드로 구성되어 있어 동시에 실행할 수 없고,
		 * 먼저 실행된 메소드가 종료되어야 다음 메소드를 실행할 수 있다.
		 */
		
		List<Student> list = new Vector<>();
		list.add(new Student(202101, "A", "101"));
		list.add(new Student(202102, "B", "102"));
		list.add(new Student(202103, "C", "103"));
		list.add(new Student(202104, "D", "103"));
		list.add(new Student(202105, "E", "105"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get -> list 안에 갖고있는 값이 출력된다.
		}
	}            
}
