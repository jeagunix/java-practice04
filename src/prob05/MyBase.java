package prob05;

//mybase만 고치키
public class MyBase extends Base {
	// mybase만 고치기
	// 오버라이드문제
	public MyBase() {

	}

	public void service(String state) {
		if (state.equals("낮")) {
			day();
		} else if (state.equals("밤")) {
			night();
		} else
			noon();
	}

	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
	}

	@Override
	public void night() {

		System.out.println("night");

	}
	public void noon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}