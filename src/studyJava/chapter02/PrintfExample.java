package studyJava.chapter02;

public class PrintfExample {
	public static void main(String[] args) {

		// 1. 시스템 입력
		
		// System.in.read();
		
		
		// 2. 시스템 출력
		System.out.print("출력"); // 괄호 안의 내용을 출력만 해라.
		
		System.out.println("출력"); // 괄호 안의 내용을 출력하고 행을 바꿔라.
		
		System.out.printf("%s\n", "출력"); // 괄호 안의 첫번째 문자열 형식대로 내용을 출력하라.
		
		
		int value = 600;
		
		System.out.printf("상품의 가격 : %d원\n", value); // 정수 -> %d
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%d | %s | %s", 1, name, job); // 문자열 -> %s
	}
}
