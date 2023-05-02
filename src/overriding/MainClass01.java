package overriding;

/*
 오버라이딩(overriding)
  - 상속받은 자식 클래스에서 부모 메소드 대신 자신의 메소드를 실행하는 것
  - 자신에게 맞게 변경하는 것
 조건
  - 부모 메소드와 동일한 이름, 반환타입, 매개변수를 맞춰야 한다
  - 부모의 접근 제한자보다 크거나 같아야 한다
    -> private < package < protected < public
 */

class Ferrari {
	private int ye;

	public Ferrari(int ye) {
		this.ye = ye;
	}

	public int getYe() {
		return ye;
	}

	public void speed() {
		System.out.println(getYe() + "년식 페라리 속도 300Km/h");
	}
}

class NewFerrari extends Ferrari {
	public NewFerrari(int ye) {
		super(ye);
	}

	public void autoSystem() {
		System.out.println("자동 운전 모드로 변환합니다");
	}

	public void speed() {
		System.out.println("변경합니다");
		System.out.println(getYe() + "년식 페라리 속도 500Km/h");
	}
	// 왼쪽 숫자 왼쪽 화살표를 확인하면 override를 확인 할 수 있음
}

public class MainClass01 {
	public static void main(String[] args) {

		Ferrari fe = new Ferrari(2023);
		fe.speed();

		NewFerrari nf = new NewFerrari(2024);
		nf.speed();
		nf.autoSystem();
		// 오버라이딩을 하지 않으면 부모의 메소드가 실행되고
		// 오버라이딩을 통해 다시 설정하면 자식의 메소드가 실행된다

	}
}
