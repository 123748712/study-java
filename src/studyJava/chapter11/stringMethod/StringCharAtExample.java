package studyJava.chapter11.stringMethod;

public class StringCharAtExample {
	public static void main(String[] args) {
		// String 메소드 예제문제 -1
		// 주민등록번호에서 남자와 여자를 구분하는 방법
		
		/*
		 *  문자 추출 (charAt(int index))
		 *  매개값으로 주어진 인덱스의 문자를 리턴한다.
		 *  즉, 문자열에서 index 위치에 있는 문자를 리턴한다.
		 */

		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 주민번호 뒷자리 첫번째 수를 출력해 남자 혹은 여자를 구분한다.
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
		
	}
}
