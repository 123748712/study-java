package studyJava.chapter08.example01;

public interface RemoteControl {

	/*
	 *  1. 인터페이스 (interface)
	 *  인터페이스는 개발 코드와 객체가 서로 통신하는 접점이다.
	 *  개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출한다.
	 *  
	 *  그 이유는 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위해서다.
	 *  개발 코드 측면에서는 코드 변경 없이 실행 내용과 리턴값을 다양하게 할 수 있다.
	 *  
	 *  선언은 class 자리에 interface 키워드를 사용한다.
	 *  
	 *  [public] interface 인터페이스이름 { ... }
	 *  
	 *  인터페이스는 상수필드와 추상메소드만으로 이루어져있다.
	 *  
	 *  interface 에서 선언된 필드는 모두 public static final 특성을 갖는다.
	 *  생략을 하여도 컴파일 과정에서 자동으로 붙게 된다.
	 *  
	 *  [public static final] 타입 상수이름 = 값;
	 *  
	 *  
	 *  2. 다중 인터페이스
	 *  
	 *  인터페이스는 다중 구현이 가능하다.
	 *  
	 *  public class 구현클래스이름 implements 인터페이스A, 인터페이스B
	 */
	
	// 상수 필드 (public static final) 생략 가능
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드 (메소드 선언부만 작성)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
