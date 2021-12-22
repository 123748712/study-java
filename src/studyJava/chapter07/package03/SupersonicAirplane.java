package studyJava.chapter07.package03;

public class SupersonicAirplane extends Airplane {

	
	/*
	 *  1. 부모메소드 호출 (super)
	 *  
	 *  자식 클래스에서 부모 클래스의 메소드를 재정의하게 되면, 부모 클래스의 메소드는 숨겨지고 재정의된 자식 메소드만 사용된다.
	 *  자식 클래스 내부에서 재정의된 부모 클래스의 메소드를 호출해야한다면 명시적으로 super
	 *  키워드를 붙여서 부모 메소드를 호출할 수 있다.
	 */
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
	}
	
}
