package studyJava.chapter09.anonymousClass;

public class Button {
	OnClickListener listener; // �������̽� Ÿ�� �ʵ�. ���� null ���̱� ������
							  // �����ڸ� ���� ���� �־��ش�.

	void setOnClickListener(OnClickListener listener) { // �Ű������� ������
		this.listener = listener;  // ���� �־������ν� ������ ���´�.
	}

	void touch() {
		listener.onClick(); // ���� ��ü�� onClick() �޼ҵ� ȣ��
	}

	static interface OnClickListener { // ��ø �������̽�
		void onClick();
	}
}
