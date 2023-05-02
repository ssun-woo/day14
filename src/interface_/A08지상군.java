package interface_;

public class A08지상군 implements Unit08{

	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다");
	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다");
	}

}
