package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Member;
import spring.MemberDao;

public class MainForDao {

	private static Logger LOGGER = LoggerFactory.getLogger(MainForDao.class);
	
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		MemberDao dao = ctx.getBean(MemberDao.class);
		Member member = dao.selectByEmail3("madvirus@madvirus.net");
		if(member != null) {
		//LOGGER.info("{}", member);
		LOGGER.info("아이디 {}, 이메일 {}, 패스워드 {}, 이름 {},등록일 {}", member.getId(), member.getEmail(), member.getPassword(), member.getName(), member.getRegisterDateTime());
		} else {
			LOGGER.info("검색 정보 없음");
		}		
		ctx.close();
	}

}
