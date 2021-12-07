package studyJava.chapter03;

public class Assignment02 {
	public static void main(String[] args) {
		/*
		 * 프록시마 센타우리 별은 지구로부터 40 * 10^12km 떨어져 있다고 한다.
		 * 빛의 속도로 프록시마 센타우리까지 간다면 시간이 얼마나 걸리는지 계산해보자.
		 * 빛의 속도는 300,000km/s 이다.
		 */

		double distance = 40e12;
		
		long lightSec = 300_000; // 광초
		long lightMin = lightSec * 60; // 광분
		long lightHour = lightMin * 60; // 광시
		long lightDay = lightHour * 24; // 광일
		long lightYear = lightDay * 365; // 광년
		
		double arrivalTime = distance / lightYear;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + arrivalTime + "광년이다.");
	}
}
