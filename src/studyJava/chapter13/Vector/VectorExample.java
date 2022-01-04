package studyJava.chapter13.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		/*
		 * 1. Vector
		 * Vector�� ArrayList�� ���� ���� ������ ������ �ִ�.
		 * �ٸ����� ����ȭ�� �޼ҵ�� �����Ǿ� �־� ���ÿ� ������ �� ����,
		 * ���� ����� �޼ҵ尡 ����Ǿ�� ���� �޼ҵ带 ������ �� �ִ�.
		 */
		
		List<Student> list = new Vector<>();
		list.add(new Student(202101, "A", "101"));
		list.add(new Student(202102, "B", "102"));
		list.add(new Student(202103, "C", "103"));
		list.add(new Student(202104, "D", "103"));
		list.add(new Student(202105, "E", "105"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get -> list �ȿ� �����ִ� ���� ��µȴ�.
		}
	}            
}
