package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.MyController;
import dao.MemberDao;
import dto.LoginRequest;
import dto.MemberDto;
import service.GetMemberNumService;


@Configuration
public class ControllerConfig {

	@Bean
	public MyController myController() {
		return new MyController();
	}
	
	/**
	 * ControllerConfig에 MemberDao를 bean 등록하는 것이 논리적으로 맞지 않지만,
	 * 별도의 config class를 만들어주려면 web.xml에 들어가서 또 추가를 해야 한다.
	 * 하지만 SpringBoot에서는 이걸 안 해도 되기 때문에 여기서도 안 하고 그냥 한 군데에 몰아 넣을 것임!
	 * **/
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public GetMemberNumService getMemberNumService() {
		return new GetMemberNumService();
	}
	
//	@Bean
//	public LoginRequest loginRequest() {
//		return new LoginRequest();
//	}
	
}
