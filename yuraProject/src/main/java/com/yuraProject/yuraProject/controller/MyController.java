package com.yuraProject.yuraProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	
	
	@GetMapping("/")
	public String root() {
		return "root";
	}

}
