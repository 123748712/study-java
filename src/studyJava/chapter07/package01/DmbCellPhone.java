package studyJava.chapter07.package01;

public class DmbCellPhone extends CellPhone {
	
	/*
	 *  1. 상속
	 *  
	 *  상속은 자식클래스 뒤에 extends 부모클래스 로 기술한다.
	 *  
	 *  그러나 다중상속 즉, 여러개의 부모클래스를 상속할 수 없다.
	 */
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
