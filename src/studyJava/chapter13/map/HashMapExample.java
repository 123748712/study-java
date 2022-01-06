package studyJava.chapter13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/*
		 * 	1. Map
		 * 	key(키), value(값) 으로 구성된 Map.Entry 객체를 저장하는 구조
		 * 
		 * 	키 1 , 값 100
		 *  키 2 , 값 200 ...
		 *  
		 *  키 1 으로 값 100을 가져올 수 있고, 키 2로 값 200을 가져올 수 있다.
		 *  키값은 중복이 불가능, 값은 중복 가능
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // key는 String, value는 Integer
		// HashMap의 키로 사용할 객체는 hashCode() 와 equals 메소드 재정의해야 한다.
		
		map.put("신용권", 85); // put 으로 데이터를 저장할 수 있다.
		map.put("홍길동", 90); // 하나하나가 Map.Entry 다.
		map.put("동장군", 80); // 모든 Map.Entry가 합쳐진걸 Map Collection 라고 한다.
		map.put("홍길동", 95);
		
		// 4개를 넣었지만 key가 "홍길동"이 중복되기 때문에 처음 "홍길동"이 마지막 "홍길동" key로 덮어 씌여진다.
		System.out.println(map.size()); // 결국 3 출력
		System.out.println(map.get("홍길동")); // 마지막 "홍길동" 값이 출력된다.
		
		
		// 2. key, value 값 얻기
		
		// 첫번째 방법, 키 집합(Key Set) 을 이용하는 방법
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String keyString = (String) keyIterator.next();
			System.out.print(keyString);
			System.out.println(" : " + map.get(keyString));
		}
		System.out.println();
		// 두번째 방법, 엔트리 집합(Entry Set)을 이용하는 방법
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // entry 에 각각의 Map.entry가 담긴다.
			System.out.print(entry.getKey()); // key 를 가져오는 키워드
			System.out.println(" : " + entry.getValue()); // get을 가져오는 키워드
		}
	}
}
