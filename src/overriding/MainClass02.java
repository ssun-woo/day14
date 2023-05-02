package overriding;

import java.util.ArrayList;

class A02 extends ArrayList<String> {
	// 상속받으면 그안에 기능을 사용할 수 있다
	String[] arr = new String[3];

	public void test() {
	}

	@Override // 주석(어노테이션)
	public boolean add(String e) {
		System.out.println("내용을 추가해 줍니다");
		arr[0] = e;
		return true;
	}
	// alt + shift + s 클릭 후
	// override/implement methods.. 클릭해서 원하는 기능을 클릭해서 호출 가능

	@Override
	public String get(int index) {
		System.out.println("내가 만든 get 실행");
		return arr[index];
	}
}
// overriding은 기본적으로 부모의 어떠한 기능을 내가 원하는대로 사용할 때 쓴다

public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.add("안녕하세요");
		System.out.println(a.get(0));
		
		// a.으로 add를 확인해보면 원래는 ArrayList지만
		// 오버라이딩을 받은 후에는 A02로 보임
	}
}
