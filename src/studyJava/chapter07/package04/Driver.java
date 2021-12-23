package studyJava.chapter07.package04;

public class Driver {

	// Vehicle을 이용하는 클래스
	
	public void drive(Vehicle vehicle) { // 자식 객체가 재정의한 run() 메소드 실행
		vehicle.run();
	}
}
