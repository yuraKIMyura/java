package spring;

import java.util.Collection;

public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter(MemberDao memberDao, MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		System.out.println("[MemberListPrinter] printAll method 실행 시작, memberDao.selectAll() method 실행 예정");
		Collection<Member> members = memberDao.selectAll();
		System.out.println("[MemberListPrinter] is members Collection empty? " + members.isEmpty());
		members.forEach(m->printer.print(m));
		
	}
	
	
}
