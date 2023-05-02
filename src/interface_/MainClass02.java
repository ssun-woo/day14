package interface_;

import java.util.ArrayList;

class A01 {
	public void aa() {
	}
}

class B01 extends A01 {
	public void aa() {
	}

	public void test() {
	}
}

public class MainClass02 {
	public static void main(String[] args) {

		A01 a = new B01();
		// a.test() > 불가능
		// 부모 형태로 만들면 자식의 메소드는 보이지 않음

		B01 b = (B01) a;
		b.test();
		// 다운케스팅
		// 자식의 형태로 다시 바꿔서 사용

		ArrayList arr = new ArrayList<>();
		arr.add(111);
		arr.add("aaa");
		arr.add(111.11);
		arr.add(111);
		// 자동적인 업케스팅
		// 근데 이 때는 문제가 발생함

		// int num = arr.get(0);
		// 받을때도 object타입으로 얻어오기 때문에 오류 발생

		int num = (int) arr.get(0);
		// 이렇게 형변환(다운케스팅)해줘야 사용가능

	}
}
