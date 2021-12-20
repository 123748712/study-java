package studyJava.chapter06;

public class Earth {
	
	/*
	 *   1. final 필드
	 *   
	 *   final 을 선언하게 된다면 즉, 초기값이 설정된다면 프로그램 실행 도중 수정할 수 없다.
	 *   final 타입 필드 [= 초기값]; 으로 선언한다.
	 */
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
}
