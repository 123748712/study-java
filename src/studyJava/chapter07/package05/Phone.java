package studyJava.chapter07.package05;

public abstract class Phone {

	/*
	 * 1. 추상클래스
	 * 
	 * 공통적인 필드와 메소드들을 사용하기 위해 추상 클래스를 사용한다. class 앞에 abstract 키워드를 붙이면 된다.
	 * 
	 * abstract 를 붙이면 new 연산자를 이용한 객체를 만들지 못하고, 상속을 통해 자식 클래스만 만들 수 있다.
	 */

	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
