package studyJava.chapter06;

public class CarExample {
	public static void main(String[] args) {
		
		Car car = new Car(); // ��ü(�ν��Ͻ�) ����
		
		System.out.println("����ȸ�� : " + car.company);
		System.out.println("�𵨸� : " + car.model);
		System.out.println("���� : " + car.color);
		System.out.println("�ְ�ӵ� : " + car.maxSpeed);
		System.out.println("����ӵ� : " + car.speed);
		// �ʵ尪 �б�
		
		car.speed = 60;
		System.out.println("������ �ӵ� : " + car.speed); // �ʵ尪 ����
	}
}
