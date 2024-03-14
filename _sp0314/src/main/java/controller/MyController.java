package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.LoginRequest;
import service.GetMemberNumService;

@Controller
public class MyController {
	
	@Autowired
	private GetMemberNumService getMemberNumService; 

    /**이게 href링크와 action에서 호출하는 URI template이다.**/
	@GetMapping("/")
	public String root() {
		/**이건 .jsp, .html 파일의 이름이다.**/
		return "index";
	}
	
//	@GetMapping("/hello")
//	public String hello() {
//		return "hello";
//	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String login() {
		return "inputForm";
	}
	
	
	/**parameter 가져올 수 있는 세 가지 방법
	 * 1) DTO 생성해서 그 객체 DTO dto를 controller method parameter로 전달하면 Spring MVC에서 자동으로 연결해줌
	 * 2) HttpServletRequest request를 controller method parameter로 전달해서 전통적인 request.getParameter하기
	 * 3) @RequestParam type variableName을 controller method parameter로 전달해서 바로 쓰기 
	 * **/
	
	@GetMapping("/result")
	public String result(LoginRequest loginRequest) {
		System.out.println(loginRequest.getId());
		System.out.println(loginRequest.getEmail());
		System.out.println(getMemberNumService.getNumRecords());
		return "result";
	}
	
//	public String result(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String email = request.getParameter("email");
//		System.out.println(id +" / " + email);
//		return "result";
//	}
	
//	public String result(@RequestParam String id, String email) {
//		System.out.println(id +" / " + email);
//		return "result";
//	}
	

	
	
}
