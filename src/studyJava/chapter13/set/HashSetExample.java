package studyJava.chapter13.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		/*
		 * 1. Set
		 * Set�� �ߺ��� ��ü�� ������ �� ����.
		 */

		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("java");
		System.out.println(list.size()); // 5���� ��ü�� �־� 5 ���

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		System.out.println(set.size()); // �ߺ��� �Ұ����� 1 ���

		// ���� ��ü�� ����Ҷ� �Ϲ����� for���� ����� �� ����.

		Iterator<String> iterator = set.iterator(); // ù��° ���, iterator : �ݺ���
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(set);
		}
		for (String string : set) { // �ι�° ���, ���� for�� (foreach��)
			System.out.println(set);
		}
	}
}
