package dokidokiUniversity;

public class NPC_Min extends NPC{
	String name = "지";
	int lovePoint = 60;
	
	public int loveAttack() {
		System.out.println("이런, 미처 제대로 닫지 못한 상자처럼 지의 입에서 단어들이 쏟아집니다.");
		System.out.println("오해하지 말고 들어줘, 난...네가 지옥의 주둥아리인 것 참을 수 있어...");
		System.out.println("네 얼굴이 너무 내 취향이야. 줌잼민 사진...내가 하루에 몇번씩 본다.");
		System.out.println("내가 딱 그런 얼굴을 좋아하거든. 근데 뭐 니 얼굴만. 성격이나 이런 건 아니고...");
		System.out.println("그니깐 나랑 자주 놀아줘라! 난 딱 그정도가 좋아.");
		System.out.println();
		System.out.println("이런...어리석은 재는 지의 말을 고백이라고 치부합니다.");
		System.out.println("재는 좋은 말로 거절을 합니다. 재의 주변에 신경쓸 일들이 너무 많아집니다.");
		System.out.println("재의 스트레스가 1000 증가합니다...");
		return 1000;
	}
}
