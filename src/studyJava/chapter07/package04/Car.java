package studyJava.chapter07.package04;

public class Car {
	
	/*
	 *  1. final �޼ҵ�
	 *  
	 *  �޼ҵ带 �����ҋ� final Ű���带 ���̸� �� �޼ҵ�� �������� �޼ҵ��̹Ƿ� �������� �� ����.
	 *  ��, �θ� Ŭ������ ����ؼ� �ڽ� Ŭ������ ������ �� �θ� Ŭ������ ����� final �޼ҵ��
	 *  �ڽ� Ŭ�������� �����ǵ� �� ���ٴ� ��.
	 */
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	// final �޼ҵ� ����, ������ �Ұ��� !
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
