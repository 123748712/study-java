package studyJava.chapter07.package03;

public class SupersonicAirplane extends Airplane {

	
	/*
	 *  1. �θ�޼ҵ� ȣ�� (super)
	 *  
	 *  �ڽ� Ŭ�������� �θ� Ŭ������ �޼ҵ带 �������ϰ� �Ǹ�, �θ� Ŭ������ �޼ҵ�� �������� �����ǵ� �ڽ� �޼ҵ常 ���ȴ�.
	 *  �ڽ� Ŭ���� ���ο��� �����ǵ� �θ� Ŭ������ �޼ҵ带 ȣ���ؾ��Ѵٸ� ��������� super
	 *  Ű���带 �ٿ��� �θ� �޼ҵ带 ȣ���� �� �ִ�.
	 */
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly(); // Airplane ��ü�� fly() �޼ҵ� ȣ��
		}
	}
	
}
