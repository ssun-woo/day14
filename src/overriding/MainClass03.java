package overriding;

import java.util.ArrayList;

class A03{
	
}

class B03 extends A03{
	
}

class C03{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "[" + age + "," + name + "]";
	}
	
	
	
}

public class MainClass03 {
	public static void main(String[] args) {
		
		Object b = new B03();
		Object num = "aaa";
		Object num1 = 111;
		Object num2 = 111.11;
		// Object java에서 사용하는 모든것들의 조상, 어떠한 타입도 들어올 수 있다
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		
		C03 c = new C03();
		c.age = 20;
		c.name = "홍길동";
		
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("-------------------------");
		System.out.println(arr);
		System.out.println(arr.toString());
		// 객체에 대한 주소를 보고싶은가 객체에 저장된 값을 보고싶은가를 생각해봐야 함
		

		// C03에 toString을 override해서 확인하면 주소가 아닌 그 안의 내용을 확인 가능
		
		
		
		
		
		
		
		
		
	}
}
