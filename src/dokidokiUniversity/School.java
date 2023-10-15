package dokidokiUniversity;

public class School {

	int haveLunchWMin(){		
		System.out.println("지와 함께 밥을 먹습니다. 지의 호감도가 10 증가합니다.");
		return 10;	
	}	
	int haveLunchWBio(){
		System.out.println("재가 과 동기들과 밥을 먹습니다. 재의 스트레스가 5 감소합니다.");
		return -5;
	}
	int haveLunchWKwon(){
		System.out.println("재가 수와 밥을 먹습니다. 재의 스트레스가 10 감소합니다.");
		return -10;	
	}
	int haveLunchAlone(){
		System.out.println("재가 혼자 밥을 먹습니다. 여자친구의 무대영상을 보며 스트레스가 15 감소합니다.");
		return -15;
	}
	int[] coffeeTimeWMin() {
		System.out.println("수의 권유로 지와 함께 공강시간에 커피를 마십니다. 지의 호감도가 10 증가합니다. 재의 스트레스가 5 감소합니다.");
		int complex[] = new int[] {10,-5};
		return complex;
	}
	int coffeeTimeWBio() {
		System.out.println("재가 과 동기들과 편의점에서 커피를 사 마십니다. 영양가 없는 대화들만 오갑니다. 재의 스트레스가 5 감소합니다.");
		return -5;
	}
	int[] coffeeTimeWKwon() {
		System.out.println("재가 수와 대학원 진학 계획을 나눕니다. 수의 호감도가 15 증가합니다. 재의 스트레스가 5 감소합니다.");
		int complex[] = new int[] {15,-5};
		return complex;
	}	
	int[] libraryWMinKwon() {
		System.out.println("시험 공부를 위해 수,지와 도서관에 왔습니다. 둘은 떠들고 집중은 안됩니다.");
		System.out.println("암기를 위해 샤프로 전공내용을 빽빽히 쓰던 재는 지우개를 집다가 지와 손이 스칩니다.");
		System.out.println("지의 호감도 15 증가합니다. 재의 스트레스가 15 증가합니다.");
		int complex[] = new int[] {15,15};
		return complex;
	}
	int libraryAlone() {
		System.out.println("시험 공부를 위해 도서관에 왔습니다. 그럭저럭 시험 준비를 마무리합니다. 그렇지만 공부는 힘든 법이죠.");
		System.out.println("재의 스트레스가 100 증가합니다.");
		return 100;
	}
}
