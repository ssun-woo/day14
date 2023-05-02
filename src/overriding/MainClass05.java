package overriding;

class A05 {
	public void test() {
	}

	void test1() {

	}
}

class B05 extends A05 {
	public void test() {

	}

	void test1() {

	}
}
// 부모가 public >> override받은 메소드는 반드시 public
// default(package) >> override받은 메소드는 반드시 default이상(package, protected, public)

public class MainClass05 {
	public static void main(String[] args) {
		B05 b = new B05();
	}
}
