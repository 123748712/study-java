package studyJava.chapter03;

public class Assignment02 {
	public static void main(String[] args) {
		/*
		 * ���Ͻø� ��Ÿ�츮 ���� �����κ��� 40 * 10^12km ������ �ִٰ� �Ѵ�.
		 * ���� �ӵ��� ���Ͻø� ��Ÿ�츮���� ���ٸ� �ð��� �󸶳� �ɸ����� ����غ���.
		 * ���� �ӵ��� 300,000km/s �̴�.
		 */

		double distance = 40e12;
		
		long lightSec = 300_000; // ����
		long lightMin = lightSec * 60; // ����
		long lightHour = lightMin * 60; // ����
		long lightDay = lightHour * 24; // ����
		long lightYear = lightDay * 365; // ����
		
		double arrivalTime = distance / lightYear;
		
		System.out.println("���� �ӵ��� ���Ͻø� ��Ÿ�츮 ������ ���µ� �ɸ��� �ð��� " + arrivalTime + "�����̴�.");
	}
}
