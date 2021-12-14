package studyJava.chapter05;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		
		// 1. new 연산자로 배열 생성
		// 타입[] 변수 = new 타입[길이];
		
		int[] arr1 = new int[3]; // int[] arr1 은 stack 영역에, new int[5] 는 heap 영역에 저장된다.
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); // 값이 저장되어 있지 않아 0 으로 출력
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
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}
