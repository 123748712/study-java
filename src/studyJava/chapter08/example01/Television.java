package studyJava.chapter08.example01;

public class Television implements RemoteControl {
	private int volume;

	// 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV 를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
