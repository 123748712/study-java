package studyJava.chapter11.stringMethod;

public class StringIndexOfExample {
	public static void main(String[] args) {
		// String 메소드 예제문제 -3
		// 문자열 포험 여부 조사 (indexOf())

		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // "자바 프로그래밍" 에서 "프로그래밍"이 위치해 있는 인덱스 위치가 3 이다.
		
		if(subject.indexOf("자바") != -1) { // "자바" 라는 찾는 문자열이 포함되어 있는 경우
			System.out.println("자바와 관련된 책이군요.");
		} else { // "자바"라는 찾는 문자열이 포함되어 있지 않은 경우
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
	}
}
