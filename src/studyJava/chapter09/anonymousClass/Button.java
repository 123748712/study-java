package studyJava.chapter09.anonymousClass;

public class Button {
	OnClickListener listener; // 인터페이스 타입 필드. 현재 null 값이기 때문에
							  // 생성자를 통해 값을 넣어준다.

	void setOnClickListener(OnClickListener listener) { // 매개변수의 다형성
		this.listener = listener;  // 값을 넣어줌으로써 오류를 막는다.
	}

	void touch() {
		listener.onClick(); // 구현 객체의 onClick() 메소드 호출
	}

	static interface OnClickListener { // 중첩 인터페이스
		void onClick();
	}
}
