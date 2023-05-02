package interface_;

public class B08공군 implements Unit08{

	@Override
	public void attack() {
		System.out.println("공군이 공격합니다");
	}
                                                  
	@Override
	public void defense() {
		System.out.println("공군이 방어합니다");
	}

}
