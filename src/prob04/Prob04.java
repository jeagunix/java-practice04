package prob04;

public class Prob04 {

	public static void main(String[] args) {
		Employee pt = new Depart( "홍길동", 3000, "개발부" );
		//오버라이드해서 부서까지 나오게하기
		pt.getInformation();
	}
}