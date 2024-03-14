package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dto.InputData;

@Controller
public class MyController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
	
	@GetMapping("/input")
	public String input() {
		return "inputForm";
	}
	
	@GetMapping("/result")
	public String result(InputData inputData, Model model) {
		String name = inputData.getName();
		String birthday = inputData.getBirthday();
		String str = "가나다";
		model.addAttribute("str", str);
		System.out.println(name + " / " + birthday);
		return "result";
	}
	
}
