package overriding;

final class A04{
	public void test() {
		System.out.println("부모 메소드");
	}
}

class B04{
	A04 a = new A04();
	public void test() {
		a.test();
		
		System.out.println("자식 메소드");
	}
}

// 내가 class를 만들고 그 class가 변경되지 않았으면 한다면 final 키워드를 붙여줌
// 사용하려면 상속이 아닌 객체를 새로 만들어서 사용해야함
// 그 예로 String이 있다 
// 상속은 불가능, String s; 같이 변수로 만들어서 사용함 
public final class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
