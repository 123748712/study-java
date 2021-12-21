package studyJava.chapter06.package01;

public class Car {

	/*  
	 *   객체 지향 프로그래밍에서는 객체의 필드를 객체 외부에서 직접적으로 접근하는 것을 막는다.
	 *   이유는 외부에서 마음대로 변경할 경우 객체의 무결성(결점이 없는 성질)이 깨질 수 있기 때문이다.
	 *   예를 들어 자동차의 속력은 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
	 *   
	 *   접근제한은 4가지가 있다.
	 *   
	 *   1. public
	 *   2. protected
	 *   3. default
	 *   4. private
	 *   
	 *   아래로 내려갈수록 접근 제한이 강화된다.
	 *   
	 *   그래서 Getter 와 Setter 메소드를 사용한다.
	 *   
	 *   1. Setter
	 *   필드는 외부에서 접근할 수 없도록 막고 메소드는 공개해서 외부에서 메소드를 통해 필드에 접근하도록 유도한다.
	 *   
	 *   2. Getter
	 *   메소드로 필드값을 가공하고 외부로 전달한다.
	 */
	
	private int speed;
	private boolean stop; // private 로 접근 제한을 강화한다.
	
	public int getSpeed() { // getter 메소드
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) { // 멈추게 되면 차의 속력도 0이 된다.
		this.stop = stop;
		this.speed = 0;
	}
	
	/*
	 *  위 메소드와 같이 get 과 set 으로 입력 및 출력을 직접적으로 하지 않게 해준다.
	 */
}
