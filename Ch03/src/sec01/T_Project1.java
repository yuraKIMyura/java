//240105 선생님과 같은 코드로 연습. 남의 코드를 내가 원하는 방식으로 수정하는 연습을 위해 진행함
package sec01;

import java.util.Scanner;

public class T_Project1 {

	public static void main(String[] args) {
		String memberName="";
		String memberSSN ="";
		String memberTel="";
		
		boolean loginStatus = false; //로그인 여부
		boolean membershipStatus = false; //회원가입 여부
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				if(loginStatus) {
					System.out.println("이미 로그인 상태입니다.");
					continue;
				}
				
				// 로그인 처리
				
				System.out.print("아이디:");  //출력문
				String name = scanner.nextLine(); // name 변수의 값 입력
				System.out.print("패스워드:");
				String strPassword = scanner.nextLine();//패스워드입력
				int password = Integer.parseInt(strPassword); // stpassword값을 정수로 변환
				if (name.equals(memberName)) {
					if (strPassword.equals(memberSSN)) {
						loginStatus = true;
						System.out.println("로그인 성공");
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
				break;
			case 2:
				
				if(membershipStatus) {
					System.out.println("이미 회원가입 상태입니다.");
					System.out.printf("회원이름: %s \n", memberName);
					membershipStatus = true;	
															
					boolean isRepeating = true;
					while(isRepeating) {
						System.out.println("가입 절차를 계속 진행하시겠습니까? [Y/N]");
						String response = scanner.nextLine();
						if(response.equalsIgnoreCase("y")) {
							break;
						}else if(response.equalsIgnoreCase("n")) {
							isRepeating = false;
							break;
						}else {
							System.out.println("Y 또는 N으로 입력해주세요.");
						}//else
					}//while
				}else {
					// 회원 가입
					System.out.println("회원 가입");
					
					System.out.println("[필수 정보 입력]"); 
					System.out.print("1. 이름: ");
					memberName = scanner.nextLine(); 
					System.out.print("2. 주민번호 앞 6자리: ");
					memberSSN = scanner.nextLine(); 
					System.out.print("3. 전화번호: "); 
					memberTel = scanner.nextLine();
					System.out.println();
					System.out.println("[입력된 내용]");
					System.out.println("1. 이름: " + memberName);
					System.out.println("2. 주민번호 앞 6자리: " + memberSSN); 
					System.out.println("3. 전화번호: " + memberTel);
					membershipStatus = true;
				}				
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				boolean run2 = true;
				int balance = 0;
				
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				System.out.println("프로그램 종료");
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
