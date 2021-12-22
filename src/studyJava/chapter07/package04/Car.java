package studyJava.chapter07.package04;

public class Car {
	
	/*
	 *  1. final 메소드
	 *  
	 *  메소드를 선언할떄 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로 재정의할 수 없다.
	 *  즉, 부모 클래스를 상속해서 자식 클래스를 선언할 때 부모 클래스에 선언된 final 메소드는
	 *  자식 클래스에서 재정의될 수 없다는 것.
	 */
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	// final 메소드 선언, 재정의 불가능 !
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
