package studyJava.chapter06.package01;

public class Car {

	/*  
	 *   ��ü ���� ���α׷��ֿ����� ��ü�� �ʵ带 ��ü �ܺο��� ���������� �����ϴ� ���� ���´�.
	 *   ������ �ܺο��� ������� ������ ��� ��ü�� ���Ἲ(������ ���� ����)�� ���� �� �ֱ� �����̴�.
	 *   ���� ��� �ڵ����� �ӷ��� ������ �� �� ���µ�, �ܺο��� ������ �����ϸ� ��ü�� ���Ἲ�� ������.
	 *   
	 *   ���������� 4������ �ִ�.
	 *   
	 *   1. public
	 *   2. protected
	 *   3. default
	 *   4. private
	 *   
	 *   �Ʒ��� ���������� ���� ������ ��ȭ�ȴ�.
	 *   
	 *   �׷��� Getter �� Setter �޼ҵ带 ����Ѵ�.
	 *   
	 *   1. Setter
	 *   �ʵ�� �ܺο��� ������ �� ������ ���� �޼ҵ�� �����ؼ� �ܺο��� �޼ҵ带 ���� �ʵ忡 �����ϵ��� �����Ѵ�.
	 *   
	 *   2. Getter
	 *   �޼ҵ�� �ʵ尪�� �����ϰ� �ܺη� �����Ѵ�.
	 */
	
	private int speed;
	private boolean stop; // private �� ���� ������ ��ȭ�Ѵ�.
	
	public int getSpeed() { // getter �޼ҵ�
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) { // ���߰� �Ǹ� ���� �ӷµ� 0�� �ȴ�.
		this.stop = stop;
		this.speed = 0;
	}
	
	/*
	 *  �� �޼ҵ�� ���� get �� set ���� �Է� �� ����� ���������� ���� �ʰ� ���ش�.
	 */
}
