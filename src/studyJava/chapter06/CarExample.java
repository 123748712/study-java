package studyJava.chapter06;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car(); // 객체(인스턴스) 생성
		
		System.out.println("제작회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed);
		// 필드값 읽기
		
		car.speed = 60;
		System.out.println("수정된 속도 : " + car.speed); // 필드값 변경
	}
}
