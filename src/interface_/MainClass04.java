package interface_;

class A04{
	public void a04() {
		System.out.println("부모");
	}
}

class B04 extends A04 implements Interface04{
// 반드시 실체화를 시켜줘야 한다		// interface 같은 경우에는 extends와 다르게 다중으로 사용이 가능하다
	@Override
	public void test() {
		
	}

	@Override
	public void test1() {
		
	}
	
}

public class MainClass04 {
	public static void main(String[] args) {
		
		
		
	}
}
