package studyJava.chapter13.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		/*
		 * 1. LinkedList
		 * LinkedList 는 ArrayList 와 사용벙법은 동일하나 내부구조는 완전히 다르다.
		 * ArrayList 는 내부 배열에 객체를 저장해서 관리하지만,
		 * LinkedList 는 인접 참조를 링크해서 체인처럼 관리한다.
		 */

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
		
		/* 
		 * 	끝에서부터 순차적으로 추가 또는 삭제하는 경우는 ArrayList가 빠르지만
		 * 	중간에 추가, 삭제하는 경우는 LinkedList가 더 빠르다.
		 * 	앞뒤 링크 정보만 변경하기 떄문에 속도가 빠를 수 밖에 없다.
		 */
	}
}
