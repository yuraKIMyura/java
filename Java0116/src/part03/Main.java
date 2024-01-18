//today's final challenge
//TODO->DONE 240116 17:40 work on File Input/Output Stream
//240117 14:30 worked on deposit/withdraw method
package part03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static List<Member> memberList = new ArrayList<>();
	static boolean isUpToDate = true;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		selectGeneralMenu();
		
	}
	
	
	private static void selectGeneralMenu() throws IOException, ClassNotFoundException {			
		
		readFile();
		
		boolean isRunning = true;
		while(isRunning) {
			
			System.out.println("-".repeat(63));
			System.out.println("1.회원출력  2.회원등록  3.파일저장  4.파일읽기  5.계좌  6.종료");
			System.out.println("-".repeat(63)); 
			
			System.out.println("메뉴 선택 > ");
			int option = Integer.parseInt(scanner.nextLine());
			
			switch(option) {
				case 1: showMemberList();
				break;
				case 2: join();
				break;
				case 3: 
					System.out.println("파일저장");
					saveFile();
				break;
				case 4: readFile();
				break;
				case 5: verifyMember();
				break;
				case 6: 
					saveFile();
					System.out.println("프로그램 종료");
					isRunning = false;
				default:
				break;
			}//switch
		}//while
	}//method
	
	static void showMemberList() {
		for(Member m : memberList) {
			System.out.println(m);
		}
	}
	
	static void join() {
		System.out.println("이름");
		String name = scanner.nextLine();
		System.out.println("아이디");
		String id = scanner.nextLine();
		System.out.println("비밀번호");
		String pw = scanner.nextLine();
		Member member = new Member(name, id, pw);
		memberList.add(member);
		isUpToDate = false;
		System.out.println("3.파일저장을 잊지 마세요!");
		
	}
	
	static void verifyMember() throws IOException {
		
		boolean isMember = false;
		
		System.out.println("아이디를 입력해주세요");
		String id = scanner.nextLine();
		
		for(Member m: memberList) {
			String listedId = m.getId();
			if(id.equals(listedId)) {
				int index = memberList.indexOf(m);
				Member listedMember = memberList.get(index);
				String listedPw = listedMember.getPw();
				System.out.println("비밀번호를 입력해주세요");
				String pw = scanner.nextLine();
				if(pw.equals(listedPw)) {
					System.out.println("회원확인");
					isMember = true;
					selectAccountMenu(index);
				}
			}
		}//for
		
		if(!isMember) {
			System.out.println("회원이 아닙니다");
		}
	}//method

	static void selectAccountMenu(int index) throws IOException {
		boolean isRunning = true;
		while(isRunning) {
			
			System.out.println("-".repeat(35));
			System.out.println("1.잔고조회  2.예금  3.출금  4.종료");
			System.out.println("-".repeat(35)); 
			
			System.out.println("메뉴 선택 > ");
			int option = Integer.parseInt(scanner.nextLine());
			
			switch(option) {
				case 1: checkBalance(index);
				break;
				case 2: deposit(index);
				break;
				case 3: withdraw(index);
				break;
				case 4: 
					System.out.println("프로그램 종료");
					isRunning = false;
				default:
				break;
			}//switch
		}//while
	}	
	
	static void checkBalance(int index) {
		System.out.print("현재 잔고: ");
		System.out.print(memberList.get(index).getBalance());
		System.out.print("원\n");
	}
	
	static void deposit(int index) {
		System.out.println("예금액을 입력해주세요: ");
		int amount = Integer.parseInt(scanner.nextLine());
		memberList.get(index).setBalance(amount, 'd');
	}
	
	static void withdraw(int index) {
		System.out.println("출금액을 입력해주세요: ");
		int amount = Integer.parseInt(scanner.nextLine());
		memberList.get(index).setBalance(amount, 'w');
	}
	
	static void saveFile() throws IOException {
	
		FileOutputStream fos = new FileOutputStream("C:/Users/admin/desktop/memberList.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(memberList);
		oos.flush();
		oos.close();
		System.out.println("파일저장완료");
		isUpToDate=true;
		
	}
	
	static void readFile() throws IOException, ClassNotFoundException {
		if(!isUpToDate) {
			System.out.println("3.파일저장을 먼저 실행해주세요.");
		}else {
			System.out.println("파일읽기");
			FileInputStream fis = new FileInputStream("C:/Users/admin/desktop/memberList.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			memberList = (List<Member>) ois.readObject();
			for(Member m : memberList) {
				System.out.println(m);
			}
			ois.close();
			System.out.println("파일읽기완료");
		}
	}
	
	

}
