package studyJava.chapter07.package01;

public class DmbCellPhone extends CellPhone {
	
	/*
	 *  1. ���
	 *  
	 *  ����� �ڽ�Ŭ���� �ڿ� extends �θ�Ŭ���� �� ����Ѵ�.
	 *  
	 *  �׷��� ���߻�� ��, �������� �θ�Ŭ������ ����� �� ����.
	 */
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}