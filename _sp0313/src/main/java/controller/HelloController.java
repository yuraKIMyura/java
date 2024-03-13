package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//교재 p.241

@Controller
public class HelloController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("str", "한글");
		return "hello";//view 이름
	}
	
//	public String hello (Model model, @RequestParam(value="name", required=false) String name) {
//		model.addAttribute("greeting", "안녕하세요, " + name);
//		return "hello";
//	}
}
