package com.yuraProject.yuraProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuraProject.yuraProject.dao.MemberDao;
import com.yuraProject.yuraProject.dto.Member;
import com.yuraProject.yuraProject.service.MemberService;


@Controller
public class MyController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/")
	public String root(Model model) {
		model.addAttribute("allList", memberService.selectAll());
		return "root";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Member member, Model model) {
		memberService.register(member);
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("id") int id, Model model) {
		Member member = memberService.searchById(id);
		System.out.println(member.getMemo());
		model.addAttribute("allList", memberService.selectAll());
		model.addAttribute("member", member);
		return "updateForm";
	}
	
	@PostMapping("/commitUpdate")
	public String commitUpdate(@ModelAttribute Member member, Model model) {
		memberService.update(member);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		memberService.delete(id);
		return "redirect:/";
	}

}
