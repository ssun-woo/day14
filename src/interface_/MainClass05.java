package interface_;

class A05 {
	public void a05() {
		System.out.println("특정 기능");
	}
}

interface Int05 {
	public void inte();
}

class B05 extends A05 implements Int05 {

	public void b05() {
		System.out.println("새로운 기능 추가");
	}

	public void inte() {

	}
	// interface를 상속받으면 무조건 기능을 만들어서 사용해야함
	// extends와는 기능적으로 다름
}

public class MainClass05 {
	public static void main(String[] args) {

		B05 b = new B05();
		b.a05();
		b.b05();

	}
}
