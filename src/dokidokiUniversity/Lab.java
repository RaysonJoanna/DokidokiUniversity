package dokidokiUniversity;

public class Lab {

	public int silence(){
		System.out.println("재는 침묵을 선택했습니다. 사수 데이터실험을 조용히 했습니다.");
		System.out.println("스트레스는 꽤 받았지만, 그럭저럭 나쁘지 않은 결과를 얻었습니다. 재의 스트레스가 40 증가합니다.");
		return 40;
	}
	
	public int noResult() {
		System.out.println("재는 사수 데이터 실험을 해주며 혼자 욕을 합니다. '저러니 교수가 박사 안 시켜주지' '이번에도 안 될거다!'");
		System.out.println("이런, 나쁜 심보로 실험하니 결과가 나오지 않았습니다. 재의 스트레스가 50 증가합니다.");
		return 50;
	}
	
	public int noReward() {
		System.out.println("재는 선배에게 못 챙겨서 죄송하다며 서둘러 실험을 합니다. 기분은 별로지만 3시간 실험 끝에 좋은 데이터가 나왔습니다.");
		System.out.println("박사 5년차 선배는 교수님께 데이터를 들고 가 확인을 받습니다. 교수님이 선배를 칭찬하고, 선배는 집에 들어가보라합니다.");
		System.out.println("교수님이 졸업실험 진척상황을 묻고, 재는 혼이 납니다. 재의 스트레스가 60 증가합니다.");
		return 60;
	}
}