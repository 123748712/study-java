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
		 * Set은 중복된 객체를 저장할 수 없다.
		 */

		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("java");
		list.add("java");
		System.out.println(list.size()); // 5개의 객체가 있어 5 출력

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("java");
		System.out.println(set.size()); // 중복이 불가능해 1 출력

		// 안의 객체를 출력할때 일반적인 for문은 사용할 수 없다.

		Iterator<String> iterator = set.iterator(); // 첫번째 방법, iterator : 반복자
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(set);
		}
		for (String string : set) { // 두번째 방법, 향상된 for문 (foreach문)
			System.out.println(set);
		}
	}
}
