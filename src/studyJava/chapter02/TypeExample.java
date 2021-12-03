package studyJava.chapter02;

public class TypeExample {
	public static void main(String[] args) {
		// 자바는 정수, 실수, 논리값을 저장할 수 있는 기본타입을 제공한다.
		// 정수타입 : byte, char, short, int, long
		// 실수타입 : float, double
		// 논리타입 : boolean

		
		// 1. int 타입 변수 저장 및 출력 방법		

		int var1 = 0b1011; 	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365; 	// 10진수
		int var4 = 0xB3;	// 16진수

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		// 2. byte 타입 변수 저장 및 출력		
		
		byte var5 = -128;
		byte var6 = -30;
		byte var7 = 0;
		byte var8 = 127;
		// byte 타입은 -128 ~ 127 까지 허용한다.
		// byte var = 128 은 컴파일에러가 발생한다.
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);

		
		// 3. long 타입 변수 저장 및 출력 방법

		// long balance = 30000000000 은 컴파일 에러가 난다.
		// 즉, long 타입임을 컴파일러에게 알려주기 위해 리터럴 뒤에 소문자 l , 대문자 L 을 뒤에 붙혀주면 된다.

		long balance = 30000000000L;
		
		System.out.println(balance);
		
		
		// 3. char 타입 변수 저장 및 출력
		
		// char 타입은 작은따옴표로 감싼 하나의 문자를 출력한다.
		
		char var9 = 'A'; 		// 문자를 직접 저장
		char var10 = 65;  		// 10진수로 저장
		char var11 = '\u0041';  // 16진수로 저장
	
		System.out.println(var9);
		System.out.println(var10);
		System.out.println(var11);
		
		int var12 = 'A';  // 번외로 int로 선언하면 유니코드값을 출력한다.
		
		System.out.println(var12);
		
		
		// 4. String 타입 변수 저장 및 출력
		
		// String 타입은 클래스 타입이다.
		// 큰따옴표로 감싼 문자열이며 역슬래시(\) 가 붙은 이스케이프 문자를 사용할 수 있다.
		
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println("이름은\n " + name + "입니다."); // 줄바꿈
		System.out.println("직업은/t " + job + "입니다.");  // 탭 크기만큼 띄움
		
		
		// 5. 실수 타입인 float 과 double 타입 변수 저장 및 출력
		
		// 실수값 저장
	
		//float var = 3.14 는 컴파일 에러가 난다.
		//float 타입임을 컴파일러에게 알리려면 소문자 f, 대문자 F 를 뒤에 붙혀주면 된다.
	
		float var13 = 3.14f;
		double var14 = 3.14;
		
		// 정밀도 테스트
		
		float var15 = 0.1234567890123456789f;
		double var16 = 0.1234567890123456789;
		
		System.out.println(var13);
		System.out.println(var14);
		System.out.println(var15); 
		System.out.println(var16);  // double 타입인 var16 이 float 타입인 var15 보다 2배 이상 정밀한 값을 출력한다.
		
		
		// 6. 논리 타입인 boolean 타입
		
		// 주로 조건문과 제어문의 실행 흐름을 변경하는데 사용한다.
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다."); // boolean stop은 현재 true 값이기 때문에 중지합니다. 를 출력한다.
		} else {
			System.out.println("실행합니다.");
		}
	
	}
}
