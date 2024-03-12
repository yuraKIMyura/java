package practice;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	
	//@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	

	public void regist() {
		memberDao.process();
		System.out.println("[MemberRegisterService] regist()");
	}
	
}
