package dokidokiUniversity;

public class DowonVill {
	public int chickenChoice() {
		System.out.println("지의 휴대폰으로 배민을 봅니다. 어머~ 둘은 가까이 앉습니다.");
		System.out.println("지의 호감도가 30 증가합니다.");
		return 30;
	}

	public int gameKang() {
		System.out.println("재는 라이어로 강소희를 지목합니다. 그럭저럭 무미건조하게 게임이 끝났습니다. 재의 스트레스가 5 감소합니다.");
		return -5;
	}

	public int gameKim() {
		System.out.println("재는 라이어로 상를 지목합니다. 게임이 개노잼이 됐습니다. 재의 스트레스가 20 증가합니다.");
		return 20;
	}

	public int[] gameKwon() {
		System.out.println("재는 라이어로 수을 지목합니다. 수 게임이 재미없다고 짜증을 내기 시작합니다. 재의 스트레스가 10 증가합니다.");
		System.out.println("그렇지만 수의 호감도도 15 증가합니다.");
		int[] co = new int[] { 15, 10 };
		return co;
	}

	public int[] gameMin() {
		System.out.println("재는 라이어로 지을 지목합니다. 지는 '흐이이'소리를 내며 응애짓을 합니다.");
		System.out.println("지의 호감도가 10 증가합니다. 재의 스트레스가 25 증가합니다.");
		int[] c = new int[] { 10, 25 };
		return c;
	}

	public int[] talkSukus() {
		System.out.println("재는 할 얘기가 없자, 지와 수에 대해 이야기합니다. 대학원 진학계획, 학점, 취업 각종 고민들을 늘어놓았습니다.");
		System.out.println("나 혼자 너무 떠들었나?싶었는데 지는 열심히 들어줍니다. 콜라를 사러 가는 길은 나름 즐거운 시간이었습니다.");
		System.out.println("지의 호감도가 10 증가합니다. 재의 스트레스가 10 감소합니다.");
		int[] d = new int[] { 10, -10 };
		return d;
	}

	public int[] talkHungry() {
		System.out.println("재는 너무 배고프다며 실험실에서 고달팠던 하루를 이야기합니다. 오늘 치킨이 마침 땡겼다며 너스레를 떱니다. ");
		System.out.println("편의점에 가니 오늘 하루에 대한 보상으로 치맥을 할까 싶은 생각이 듭니다. 재는 지와 웃으며 맥주와 콜라를 구매합니다.");
		System.out.println("지의 호감도가 10 증가합니다. 재의 스트레스가 20 감소합니다.");
		int[] e = new int[] { 10, -20 };
		return e;
	}

	public int[] talkWeather() {
		System.out.println("재는 이젠 날씨가 제법 따뜻하다고 말합니다. 지는 '아 딱 좋아 딱 좋지'라고 호응해줍니다. ");
		System.out.println("곧 벚꽃이 피겠다며 도란도란 대화를 나눕니다. 예전에 학교 축제로 여자친구가 왔던 때를 떠올립니다. ");
		System.out.println("지의 호감도가 10 증가합니다. 재의 스트레스가 5 감소합니다.");
		int[] f = new int[] { 10, -5 };
		return f;
	}

	public int[] talkJiyeong() {
		System.out.println("재는 본인의 졸업논문을 얘기하며 지의 학교 생활에 대해 묻습니다. 지는 문과가 뭐 그렇지라며 웃습니다.");
		System.out.println("그렇게 말하면서도 지영은 본인이 하는 활동들에 대해 설명해줍니다. 지의 애정이 느껴졌습니다.");
		System.out.println("지의 호감도 25 증가합니다. 재의 스트레스가 5 감소합니다.");
		int[] g = new int[] { 25, -5 };
		return g;
	}


}
