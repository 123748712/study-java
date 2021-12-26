package studyJava.chapter07.package05;

public abstract class Phone {

	/*
	 * 1. �߻�Ŭ����
	 * 
	 * �������� �ʵ�� �޼ҵ���� ����ϱ� ���� �߻� Ŭ������ ����Ѵ�. class �տ� abstract Ű���带 ���̸� �ȴ�.
	 * 
	 * abstract �� ���̸� new �����ڸ� �̿��� ��ü�� ������ ���ϰ�, ����� ���� �ڽ� Ŭ������ ���� �� �ִ�.
	 */

	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
