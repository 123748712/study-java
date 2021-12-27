package studyJava.chapter08.example01;

public interface RemoteControl {

	/*
	 *  1. �������̽� (interface)
	 *  �������̽��� ���� �ڵ�� ��ü�� ���� ����ϴ� �����̴�.
	 *  ���� �ڵ尡 �������̽��� �޼ҵ带 ȣ���ϸ� �������̽��� ��ü�� �޼ҵ带 ȣ���Ѵ�.
	 *  
	 *  �� ������ ���� �ڵ带 �������� �ʰ� ����ϴ� ��ü�� ������ �� �ֵ��� �ϱ� ���ؼ���.
	 *  ���� �ڵ� ���鿡���� �ڵ� ���� ���� ���� ����� ���ϰ��� �پ��ϰ� �� �� �ִ�.
	 *  
	 *  ������ class �ڸ��� interface Ű���带 ����Ѵ�.
	 *  
	 *  [public] interface �������̽��̸� { ... }
	 *  
	 *  �������̽��� ����ʵ�� �߻�޼ҵ常���� �̷�����ִ�.
	 *  
	 *  interface ���� ����� �ʵ�� ��� public static final Ư���� ���´�.
	 *  ������ �Ͽ��� ������ �������� �ڵ����� �ٰ� �ȴ�.
	 *  
	 *  [public static final] Ÿ�� ����̸� = ��;
	 *  
	 *  
	 *  2. ���� �������̽�
	 *  
	 *  �������̽��� ���� ������ �����ϴ�.
	 *  
	 *  public class ����Ŭ�����̸� implements �������̽�A, �������̽�B
	 */
	
	// ��� �ʵ� (public static final) ���� ����
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ� (�޼ҵ� ����θ� �ۼ�)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
