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
		 * 	key(Ű), value(��) ���� ������ Map.Entry ��ü�� �����ϴ� ����
		 * 
		 * 	Ű 1 , �� 100
		 *  Ű 2 , �� 200 ...
		 *  
		 *  Ű 1 ���� �� 100�� ������ �� �ְ�, Ű 2�� �� 200�� ������ �� �ִ�.
		 *  Ű���� �ߺ��� �Ұ���, ���� �ߺ� ����
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // key�� String, value�� Integer
		// HashMap�� Ű�� ����� ��ü�� hashCode() �� equals �޼ҵ� �������ؾ� �Ѵ�.
		
		map.put("�ſ��", 85); // put ���� �����͸� ������ �� �ִ�.
		map.put("ȫ�浿", 90); // �ϳ��ϳ��� Map.Entry ��.
		map.put("���屺", 80); // ��� Map.Entry�� �������� Map Collection ��� �Ѵ�.
		map.put("ȫ�浿", 95);
		
		// 4���� �־����� key�� "ȫ�浿"�� �ߺ��Ǳ� ������ ó�� "ȫ�浿"�� ������ "ȫ�浿" key�� ���� ��������.
		System.out.println(map.size()); // �ᱹ 3 ���
		System.out.println(map.get("ȫ�浿")); // ������ "ȫ�浿" ���� ��µȴ�.
		
		
		// 2. key, value �� ���
		
		// ù��° ���, Ű ����(Key Set) �� �̿��ϴ� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String keyString = (String) keyIterator.next();
			System.out.print(keyString);
			System.out.println(" : " + map.get(keyString));
		}
		System.out.println();
		// �ι�° ���, ��Ʈ�� ����(Entry Set)�� �̿��ϴ� ���
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // entry �� ������ Map.entry�� ����.
			System.out.print(entry.getKey()); // key �� �������� Ű����
			System.out.println(" : " + entry.getValue()); // get�� �������� Ű����
		}
	}
}
