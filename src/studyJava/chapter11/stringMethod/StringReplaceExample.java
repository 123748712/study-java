package studyJava.chapter11.stringMethod;

public class StringReplaceExample {
public static void main(String[] args) {
	// String 메소드 예제문제 -4
	// 문자열 대치하기 (replace())
	
	String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API 를 지원합니다.";
	String newStr = oldStr.replace("자바", "JAVA"); // 첫번째 매개값인 문자열을 찾아 두번쨰 매개값인 문자열로 대치해 생성하고 리턴한다.
	System.out.println(oldStr); // 변경 전
	System.out.println(newStr); // 변경 후
}
}
