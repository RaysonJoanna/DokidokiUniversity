package dokidokiUniversity;

import java.util.Scanner;

public class DokidokiUniv {

	public static void main(String[] args) {

		// 게임에 필요한 변수
		int jaeminStress = 20;
		boolean gameGo = true;

		// 게임에 필요한 클래스 인스턴스 생성
		School school = new School();
		DowonVill dowon = new DowonVill();
		Lab lab = new Lab();
		NPC_Min min = new NPC_Min();
		NPC_Kwon kwon = new NPC_Kwon();

		// 게임설명
		System.out.println("*** 게임은 선택지를 숫자로 선택하는 방식으로 진행됩니다 ***");
		System.out.println("*** 주인공의 스트레스가 100이 되면 게임은 종료됩니다  ***");
		System.out.println();
		// 플레이어 이름설정
		System.out.println("             플레이어 이름을 정해주세요             ");
		Scanner in = new Scanner(System.in);
		String playerName = in.nextLine();
		System.out.println("죄송합니다, 주인공은 정해져있습니다. 재의 두근두근 대학생활 ");
		System.out.println();
		System.out.println("------------------- Start -------------------");
		System.out.println();
		System.out.println();
		// 게임시작
		System.out.println("오늘은 열심히 공부해야지! 재는 다짐합니다. 하지만 오전 수업에서 졸아버렸습니다.");
		System.out.println("어쩔 수 없이 오후에 열심히 하기로 하고 점심을 먹기로 합니다.");
		System.out.println();
		System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
		System.out.println();
		System.out.println("인싸 재는 여러 명의 점심 메이트에게 연락을 받습니다.");
		System.out.println("--------------------");
		System.out.println("1. 수와 지");
		System.out.println("2. 수");
		System.out.println("3. 과 동기들");
		System.out.println("4. 혼밥");
		System.out.println("선택은 숫자만 입력하면 됩니다.");

		// 학교 맵 선택지1
		while (gameGo) { // 게임 실행의 조건 잼민 스트레스 100 미만
			while (true) {// 선택지를 고르고 스트레스에 반영, 선택지 잘못 고르면 다시 입력받기
				Scanner in1 = new Scanner(System.in);
				int choice1;
				try {
					choice1 = in1.nextInt();
				} catch(Exception e) {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");
					continue;
				}
				if (choice1 == 1) {
					min.lovePoint += school.haveLunchWMin();
					break;
				} else if (choice1 == 2) {
					jaeminStress += school.haveLunchWKwon();
					break;
				} else if (choice1 == 3) {
					jaeminStress += school.haveLunchWBio();
					break;
				} else if (choice1 == 4) {
					jaeminStress += school.haveLunchAlone();
					break;
				} else {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");					
				}				
			}
			
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {	
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}
			
			System.out.println();
			System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
			System.out.println();
			System.out.println("재는 2시간의 공강시간이 있습니다.");
			System.out.println("오후에는 졸지 않으려 커피를 마시려합니다.");
			System.out.println("인싸 재는 커피를 마시자며 연락들을 받습니다.");
			System.out.println("--------------------");
			System.out.println("1. 수와 지");
			System.out.println("2. 수");
			System.out.println("3. 과 동기들");
			System.out.println("선택은 숫자만 입력하면 됩니다.");

			// 학교 맵 선택지2
			while (true) {
				Scanner in2 = new Scanner(System.in);
				int choice2;
				try {
					choice2 = in2.nextInt();
				} catch(Exception e) {
					System.out.println("1에서 3사이의 숫자를 입력해주세요.");
					continue;
				}
				if (choice2 == 1) {
					int p[] = school.coffeeTimeWMin();
					min.lovePoint += p[0];
					jaeminStress += p[1];
					break;
				} else if (choice2 == 2) {
					int p[] = school.coffeeTimeWKwon();
					kwon.lovePoint += p[0];
					jaeminStress += p[1];
					break;
				} else if (choice2 == 3) {
					jaeminStress += school.coffeeTimeWBio();
					break;
				} else {
					System.out.println("1에서 3사이의 숫자를 입력해주세요.");
				}
			}

			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {	
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}
			
			System.out.println();
			System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("재는 커피를 마신 덕분에 오후 수업을 열심히 들었습니다.");
			System.out.println("교수님 : 다음 주에 쪽지시험을 치겠어요. 점수 반영됩니다. 큼!");
			System.out.println("재는 공부를 하기 위해 도서관에 가기로 했습니다. 누구와 공부하겠습니까?");
			System.out.println("--------------------");
			System.out.println("1. 수와 지");
			System.out.println("2. 과 동기들");
			System.out.println("선택은 숫자만 입력하면 됩니다.");

			// 학교 맵 선택지3
			while (true) {
				Scanner in3 = new Scanner(System.in);
				int choice3;
				try {
					choice3 = in3.nextInt();
				} catch(Exception e) {
					System.out.println("1에서 2사이의 숫자를 입력해주세요.");
					continue;
				}
				if (choice3 == 1) {
					int[] p = school.libraryWMinKwon();
					min.lovePoint += p[0];
					jaeminStress += p[1];
					break;
				} else if (choice3 == 2) {
					jaeminStress += school.libraryAlone();
					break;
				} else {
					System.out.println("1에서 2사이의 숫자를 입력해주세요.");
				}				
			}
			
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {	
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}
			
			System.out.println();
			System.out.println("현재 재의 스트레스는 " + jaeminStress + "입니다.");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("수업은 끝났지만, 재는 졸업논문을 위해 실험실로 발길을 옮깁니다.");
			System.out.println("재를 이동시키기 위해서 '실험실'을 입력해주세요.");

			boolean moving = true;
			String laboratory = "실험실";
			while (moving) {
				Scanner move1 = new Scanner(System.in);
				String place1;
				try {
					place1 = move1.nextLine();
				} catch(Exception e) {
					System.out.println("다시 입력하세요");
					continue;
				}
				if (place1.equals(laboratory)) {
					moving = false;
				} else {
					System.out.println("다시 입력하세요");
				}
			}
			System.out.println();
			System.out.println("재는 오자마자 사수인 박사 5년차 선배에게 잔소리를 듣습니다. 재의 졸업실험이 아닌 자신의 데이터 실험을 안했다고 혼을 냅니다.");
			System.out.println("어떤 태도로 실험에 임하겠습니까?");
			System.out.println("--------------------");
			System.out.println("1. 까라면 깐다");
			System.out.println("2. 속으로 욕하면서 한다");
			System.out.println("3. 선배에게 아첨하며 실험한다");
			System.out.println("4. 실험은 셀프! 선배한테 하라고 한다.");

			while (true) {
				Scanner in4 = new Scanner(System.in);
				int choice4;
				try {
					choice4 = in4.nextInt();
				} catch(Exception e) {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");
					continue;
				}
				if (choice4 == 1) {
					jaeminStress += lab.silence();
					break;
				} else if (choice4 == 2) {
					jaeminStress += lab.noResult();
					break;
				} else if (choice4 == 3) {
					jaeminStress += lab.noReward();
					break;
				} else if (choice4 == 4) {
					System.out.println("대학원이란 그런 부조리의 연속입니다. 다시 선택하세요.");
				} else {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");
				}
				
				}
			
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}

			System.out.println();
			System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("지친 재는 집에 가려다 수의 전화를 받습니다. 수가 오늘 놀자고 하네요.");
			System.out.println("도원빌로 가는 길을 입력하세요 (도원빌,GS25,공실관,후문,중앙도서관)");
			System.out.println("장소는 띄어쓰기 없는 콤마','로 구별합니다.");

			boolean go = true;
			String way = "공실관,중앙도서관,후문,GS25,도원빌";
			
			while (go) {
				Scanner move2 = new Scanner(System.in);
				String place2;
				try {
					place2 = move2.nextLine();
				} catch(Exception e) {
					System.out.println("다시 입력하세요");
					continue;
				}
				if (place2.equals(way)) {
					go = false;
				} else {
					System.out.println("다시 입력하세요");
				}
			}
			System.out.println();
			System.out.println("--------------------");
			System.out.println("재는 무사히 수와 상의 따스한 보금자리인 도원빌에 도착했습니다.");
			System.out.println("수가 지, 소희를 불러 치킨을 시켜먹자고 합니다.");
			System.out.println("띵동-");
			System.out.println("동의를 구하는 건 아니었다고 하네요. 어떤 치킨을 먹을까요?");

			Scanner ch = new Scanner(System.in);
			String chicken = ch.nextLine();
			System.out.println();
			min.lovePoint += dowon.chickenChoice();
			
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}

			System.out.println();
			System.out.println("치킨을 시키고 기다리는동안 간단한 라이어게임을 하기로 합니다.");
			System.out.println("게임이 진행되고 있습니다, 누가 라이어인 것 같나요? [강소희, 상, 수, 지]");
			System.out.println("****** 당신의 운에 맡겨보세요! ******");

			while (true) {
				Scanner in5 = new Scanner(System.in);
				String choice5;
				try {
					choice5 = in5.nextLine();
				} catch(Exception e) {
					System.out.println("네명 중 한명의 이름을 정확히 입력하세요.");
					continue;
				}
				
				if (choice5.equals("강소희")) {
					jaeminStress += dowon.gameKang();
					break;
				} else if (choice5.equals("상")) {
					jaeminStress += dowon.gameKim();
					break;
				} else if (choice5.equals("수")) {
					int[] dpp = dowon.gameKwon();
					kwon.lovePoint += dpp[0];
					jaeminStress += dpp[1];
					break;
				} else if (choice5.equals("지")) {
					int[] dp = dowon.gameMin();
					min.lovePoint += dp[0];
					jaeminStress += dp[1];
					break;
				} else {
					System.out.println("네명 중 한명의 이름을 정확히 입력하세요.");
				}
			}
			
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}
			
			System.out.println();
			System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("똑똑똑-! 타이밍 좋게 치킨이 배달왔습니다. 서둘러 상을 펴고 먹을 준비를 합니다.");
			System.out.println("치킨을 꺼내는데 콜라가 없습니다. 재가 사오겠다고 나섭니다.");
			System.out.println("지가 편의점에서 살 것이 있다며 같이 가겠다고 합니다.");
			System.out.println("둘은 집 밖을 나섭니다.");
			System.out.println("           ...          ");
			System.out.println("           ...          ");
			System.out.println("           ...          ");
			System.out.println("           ...          ");
			System.out.println("아직은 어색한 사이. 어떤 얘기를 해야할까요?");
			System.out.println();
			System.out.println("--------------------");
			System.out.println("1. 수에 대한 이야기");
			System.out.println("2. 배고프다고 말 꺼내기");
			System.out.println("3. 날씨 얘기");
			System.out.println("4. 지에 대한 이야기");
				
			while (true) {
				Scanner in6 = new Scanner(System.in);
				int choice6;
				try {
					choice6 = in6.nextInt();
				} catch(Exception e) {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");
					continue;
				}
				 
				if (choice6==1) {
					int ts [] = dowon.talkSukus();
					min.lovePoint += ts[0];
					jaeminStress += ts[1];
					break;
				} else if (choice6==2) {
					int th [] = dowon.talkHungry();
					min.lovePoint += th[0];
					jaeminStress += th[1];
					break;
				} else if (choice6==3) {
					int[] tw = dowon.talkWeather();
					kwon.lovePoint += tw[0];
					jaeminStress += tw[1];
					break;
				} else if (choice6==4) {
					int[] tj = dowon.talkJiyeong();
					min.lovePoint += tj[0];
					jaeminStress += tj[1];
					break;
				} else {
					System.out.println("1에서 4사이의 숫자를 입력해주세요.");
				}
			}
			gameGo = true;
			// 지 호감도 100 넘으면 재 스트레스 부여
			if (min.lovePoint >= 100) {
				System.out.println();
				min.loveAttack();
				jaeminStress = 1000;
			}
			// 수 호감도 100 넘으면 이벤트 발생
			if (kwon.lovePoint >= 100) {
				System.out.println();
				kwon.loveAttack();
				jaeminStress += 30;
			}
			if (jaeminStress >= 100) {
				break;
			}
			
			System.out.println();
			System.out.println("##### 현재 재의 스트레스는 " + jaeminStress + "입니다 #####");
			System.out.println("--------------------");
			System.out.println();
			System.out.println("즐거운 시간을 보낸 재는 집으로 돌아왔습니다. 학교도 실험도 마음대로 되는 건 없지만, 하루는 흘러갑니다");
			System.out.println("재는 내일도 힘내보자며 다짐합니다. 내일은 내일의 해가 뜨니깐요.");
			System.out.println();
			System.out.println();
			System.out.println("------------------ DokiDokiUniversity ------------------");
			System.out.println("------------------ 재의 두근두근 대학생활 ------------------");
			System.out.println("------------------ 아마도 잘 할거야 파이팅!! ------------------");
		}
		System.out.println("재의 스트레스가 100이 넘었습니다. 재가 자퇴해버렸습니다.");
		System.out.println("------------------- Fail -------------------");
	}

}