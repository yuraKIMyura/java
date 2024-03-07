package spring;

import java.time.LocalDateTime;
import java.util.Collection;

public class MemberRegisterService {
	
	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public Long regist(RegisterRequest req){
		Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email" + req.getEmail());
		}
		Member newMember = new Member(req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);
		printAll();
		return newMember.getId();
	}

	
	public void printAll() {
		System.out.println("[MemberListPrinter] printAll method 실행 시작, memberDao.selectAll() method 실행 예정");
		Collection<Member> members = memberDao.selectAll();
		System.out.println("[MemberListPrinter] is members Collection empty? " + members.isEmpty());
		members.forEach(m->System.out.println(m));
		
	}
}
