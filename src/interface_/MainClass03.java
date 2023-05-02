package interface_;

/*
 추상화(abstract)
 */

abstract class A03 {
	public abstract void a03(); 
	// 추상화 메소드
	// 실질적인 코드가 없는 메소드
	// 상속받은 후 override를 하지 않으면 오류 발생
	
	public void test() {
		System.out.println("test 기능입니다");
	}
}

class B03 extends A03{
	public void b03() {
		System.out.println("새로운 기능 추가");
	}

	@Override
	public void a03() {
		System.out.println("새로운 기능 추가");
	}
	
	
}

public class MainClass03 {
	public static void main(String[] args) {
		
		B03 b = new B03();
		b.a03();
		b.b03();
		b.test();
		
		
		
		
		
	}
}
