package studyJava.chapter06;

public class Korean {

		String nation = "대한민국";
		String name;
		String ssn;  // name, ssn 은 자동초기화
		
		// 생성자 생성
		public Korean(String n, String s) {
			this.name = n; // name -> 필드, n -> 매개변수
			this.ssn = s;  // ssn -> 필드, s -> 매개변수
		}
}
