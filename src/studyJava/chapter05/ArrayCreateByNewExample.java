package studyJava.chapter05;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		
		//  new �����ڷ� �迭 ����
		// Ÿ��[] ���� = new Ÿ��[����];
		
		int[] arr1 = new int[3]; // int[] arr1 �� stack ������, new int[5] �� heap ������ ����ȴ�.
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); // ���� ����Ǿ� ���� �ʾ� 0 ���� ���
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}