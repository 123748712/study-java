package studyJava.chapter09.anonymousClass;

public class UIMain {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다."); // 일회성이기 때문에 실행후 버린다.
			}
		});
		button.touch();
	}
}
