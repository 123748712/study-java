package studyJava.chapter09.anonymousClass;

public class UIMain {
	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("��ư�� Ŭ���߽��ϴ�."); // ��ȸ���̱� ������ ������ ������.
			}
		});
		button.touch();
	}
}
