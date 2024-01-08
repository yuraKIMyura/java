//240104 project
package sec01;

import java.util.Scanner;

public class Project1 {
	
	static final String SET_ID = "userid";
	static final String SET_PW = "userpw";
	static final int TEXT_REPEAT = 35;
	static int currentBalance = 10000;
	
	static String newID="";
	static boolean isLoggedIn=false;
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		menu(scanner);
	}//main

	
	public static void menu(Scanner scanner) {
		//메뉴 보여주기
		System.out.println("=".repeat(TEXT_REPEAT));
		if(isLoggedIn) {
			System.out.printf("오늘도 안녕하신가요, %s님?\n", SET_ID);
			System.out.println("1.로그아웃  2.예금/출금");
			System.out.println("=".repeat(TEXT_REPEAT));
			System.out.println("입력>");
		}else {
			System.out.println("1.로그인  2.회원가입  3.종료");
			System.out.println("=".repeat(TEXT_REPEAT));
			System.out.println("입력>");
		}
		
		//메뉴 고르기
		int selectedMenu = Integer.parseInt(scanner.nextLine());
		if(isLoggedIn) {
			switch(selectedMenu) {
			case 1: logout(scanner); break;
			case 2: account(scanner); break;
			default: System.out.println("1 또는 2로 입력해주세요");
			}
		}else {
			switch(selectedMenu) {
			case 1: login(scanner); break;
			case 2: join(scanner); break;
			case 3: break;
			default: System.out.println("1,2,3 중에 하나를 입력해주세요");
		}//switch
		}
	}//method
	
	public static void login(Scanner scanner) {
		
		boolean isCorrectID = true;
		boolean isCorrectPW = true;
		
		while(isCorrectID) {
			System.out.println("아이디를 입력해주세요(userid): ");
			String id = scanner.nextLine();
			if(!SET_ID.equals(id)){
				System.out.println("아이디를 확인해주세요");
			}else isCorrectID = false;
		}//while
		
		while(isCorrectPW) {
			System.out.println("비밀번호를 입력해주세요(userpw): ");
			String pw = scanner.nextLine();
			if(!SET_PW.equals(pw)){
				System.out.println("비밀번호를 확인해주세요");
			}else isCorrectPW = false;
		}//while
		
		if(isCorrectID==false && isCorrectPW==false) {
	
			System.out.println("로그인에 성공하였습니다");
			isLoggedIn=true;
			menu(scanner);
		}//if
	}//method
	
	public static void logout(Scanner scanner) {
		while(true) {
			System.out.println("로그아웃 하시겠습니까? Y/N");
			String logoutResponse = scanner.nextLine();
			
			if(logoutResponse.equalsIgnoreCase("y")) {
				System.out.printf("안녕히가세요, %s님\n", SET_ID);
				isLoggedIn=false;
				menu(scanner);
			}else if(logoutResponse.equalsIgnoreCase("n")){
				menu(scanner);
			}else {
				System.out.println("Y 또는 N으로 입력해주세요.");
			}
		}//while
	}
	
	public static void join(Scanner scanner) {
		
		System.out.println("[필수 정보 입력]");
		System.out.println("1.아이디  2.비밀번호  3.생년월일  4.전화번호");
		System.out.println("-".repeat(TEXT_REPEAT));
		
		boolean isAnswered=true;
		while(isAnswered) {		
			System.out.println("가입을 진행하시겠습니까? Y/N");
			String joinResponse = scanner.nextLine();
			if(joinResponse.equalsIgnoreCase("n")) {
				System.out.println("나중에 다시 만나요.");
				menu(scanner);
			}else if(joinResponse.equalsIgnoreCase("y")) {
				//id
				boolean isIDset = checkID(scanner);
				if(isIDset) {
					//pw
					boolean isPWset = checkPW(scanner);
					if(isPWset) {
						System.out.printf("\n회원가입을 환영합니다! %s님!\n", newID);
						System.out.println("이제 자유롭게 메뉴를 즐겨보세요!");
						isAnswered=false;
						menu(scanner);
					}
				}
			}//else if
			else {
				System.out.println("Y 또는 N으로 입력해주세요.");
			}
		}//while

	}
	
	public static boolean checkID(Scanner scanner) {
		boolean isIDset = false;
		boolean isRepeated = true;
		while(isRepeated) {
			//id
			System.out.println("[1/4] 가입하려는 아이디 입력(5글자 이상)");
			String joinID = scanner.nextLine();
			if(joinID.equals(SET_ID)) {
				System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.");
			}else if(joinID.trim().isBlank()) {
				System.out.println("빈칸은 아이디가 될 수 없습니다. 다른 아이디를 입력해주세요.");
			}else if(joinID.length()<5) {
				System.out.println("아이디는 5글자 이상이어야 합니다. 다른 아이디를 입력해주세요.");
			}else {
				System.out.println(joinID +"로 가입을 진행하시겠습니까? Y/N");
				String idResponse = scanner.nextLine();
				if(idResponse.equalsIgnoreCase("y")) {
					System.out.println(joinID+"로 아이디 생성 완료!");
					newID=joinID;
					isRepeated = false;
					isIDset=true;
				}else if(idResponse.equalsIgnoreCase("n")){
					System.out.println("추천 아이디: "+joinID+(Math.random()*10000+1));
				}else {
					System.out.println("Y 또는 N으로 입력해주세요.");
				}
			}
		}//while
		return isIDset;
	}//method
	
	public static boolean checkPW(Scanner scanner) {
		boolean isPWset = false;
		boolean isValid = true;
		while(isValid) {
			//pw //정규표현식
			System.out.println("[2/4] 설정하려는 비밀번호 입력(5글자 이상)");
			String joinPW = scanner.nextLine();
			if(joinPW.trim().isBlank()) {
				System.out.println("빈칸은 비밀번호가 될 수 없습니다. 다른 비밀번호를 입력해주세요.");
			}else if(joinPW.length()<5) {
				System.out.println("비밀번호는 5글자 이상이어야 합니다. 다른 비밀번호를 입력해주세요.");
			}else {
				System.out.println(joinPW +"로 가입을 진행하시겠습니까? Y/N");
				String pwResponse = scanner.nextLine();
				if(pwResponse.equalsIgnoreCase("y")) {
					System.out.println(joinPW+"로 비밀번호 설정 완료!");
					isValid=false;
					isPWset=true;
				}else if(pwResponse.equalsIgnoreCase("n")){
					System.out.println("추천 비밀번호: "+joinPW+(Math.random()*10000+1));
				}else {
					System.out.println("Y 또는 N으로 입력해주세요.");
				}
			}
		}//while
		return isPWset;
	}//method
	
	
	public static void account(Scanner scanner) {
		//메뉴 보여주기
		System.out.println("=".repeat(TEXT_REPEAT));
		System.out.printf("%s님의 계좌정보입니다.\n", SET_ID);
		System.out.println("1.예금  2.출금  3.잔고  4.종료");
		System.out.println("=".repeat(TEXT_REPEAT));
		System.out.println("입력>");
				
		//메뉴 고르기
		int selectedMenu = scanner.nextInt();
		switch(selectedMenu) {
			case 1: deposit(scanner); break;
			case 2: withdraw(scanner); break;
			case 3: balance(scanner); break;
			case 4: quit(scanner); break;
			default: System.out.println("1,2,3,4 중에 하나의 값으로 입력해주세요");
		}//switch
		scanner.nextLine();
	}//method
		
	public static void deposit(Scanner scanner) {
		
		System.out.println("예금하실 금액을 입력해주세요. >");
		int depositAmount = scanner.nextInt();
		
		if(depositAmount<=0) {
			System.out.println("예금액은 0원보다 많아야 합니다.");
		}//if
		if(depositAmount>0){
	        scanner.nextLine(); // Consume the newline character left in the buffer
			
	        System.out.printf("예금액: %d원을 입금하시겠습니까?[Y/N] \n", depositAmount);
			String response = scanner.nextLine();
			if(response.equalsIgnoreCase("Y")) {
				currentBalance += depositAmount;
				System.out.printf("현재 잔고: %d원\n", currentBalance);
			}else if(response.equalsIgnoreCase("N")){
				System.out.println("예금을 취소합니다");
				System.out.printf("현재 잔고: %d원\n", currentBalance);
			}else {
				System.out.println("Y 또는 N으로 입력해주세요.");
			}
		}//if
		account(scanner);
	}
	
	public static void withdraw(Scanner scanner) {
		System.out.println("출금하실 금액을 입력해주세요. >");
		int withdrawAmount = scanner.nextInt();
		
		if(withdrawAmount<=0) {
			System.out.println("출금액은 0원보다 많아야 합니다.");
		}else if(withdrawAmount > currentBalance) {
			System.out.printf("잔고가 부족합니다. 현재 잔고 %d원\n", currentBalance);
		}
		
		if(withdrawAmount>0 && withdrawAmount<=currentBalance){
	        scanner.nextLine(); // Consume the newline character left in the buffer
			       
	        System.out.printf("출금액: %d원을 출금하시겠습니까?[Y/N] \n", withdrawAmount);
			String response = scanner.nextLine();
			if(response.equalsIgnoreCase("Y")) {
				currentBalance -= withdrawAmount;
				System.out.printf("현재 잔고: %d원\n", currentBalance);
			}else if(response.equalsIgnoreCase("N")){
				System.out.println("출금을 취소합니다");
				System.out.printf("현재 잔고: %d원\n", currentBalance);
			}else {
				System.out.println("Y 또는 N으로 입력해주세요.");
			}
		}//if
		account(scanner);
	}
	
	public static void balance(Scanner scanner) {
		System.out.printf("현재 잔고: %d\n", currentBalance);
		account(scanner);
	}
	
	public static void quit(Scanner scanner) {
		scanner.nextLine();
		System.out.println("메인 메뉴로 돌아갑니다.");
		menu(scanner);
	}
	
	

}//class
