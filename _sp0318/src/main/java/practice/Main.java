package practice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		/**
		 * Creates a container to manage database-related configurations.
		 * AnnotationConfigApplicationContext is used to initialize the container and configure it with the classes DbConfig and DbQueryConfig,
		 * which contain configuration information related to the database.
		 * After initializing the container, a bean of type MemberDao is retrieved
		 * from the container using ctx.getBean(MemberDao.class).
		 **/
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DbConfig.class, DbQueryConfig.class);
		MemberDao dbQuery = ctx.getBean(MemberDao.class);
		
		int count = dbQuery.count();
		LOGGER.info("인원 {}명", count);
		
//		String name = dbQuery.memberName(1);
//		LOGGER.info("고객이름:  {}", name);
		
//		Member dto = new Member("Hong", "hong@korea.com", "홍길동");
//		dbQuery.insert(dto);
		
		Member dto1 = new Member(2, "Baak", "baak@korea.com", "박하나");
		dbQuery.update(dto1);
		dbQuery.delete(5);
		
		
		List<Member> list = dbQuery.selectAll();
		for( Member m : list) {
			LOGGER.info("{} {} {} {}", m.getMemberno(), m.getId(), m.getPw(), m.getName());
		}
		
	}

}
