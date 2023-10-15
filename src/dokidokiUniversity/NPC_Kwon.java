package dokidokiUniversity;

public class NPC_Kwon extends NPC {

	String name = "수";
	int lovePoint = 40;
	
	@Override
	public int loveAttack() {
		System.out.println("사랑...했ㄷr");
		System.out.println("재의 스트레스가 30 증가합니다...");
		return 30;
	}
}
