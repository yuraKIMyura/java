package com.yuraProject.yuraProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuraProject.yuraProject.dao.MemberDao;
import com.yuraProject.yuraProject.dto.Member;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	public List<Member> selectAll(){
		return memberDao.selectAll();
	}

	public void register(Member member) {
		int result = memberDao.register(member);
		if(result==0) {
			System.out.println("register method error");
		}
	}

	public Member searchById(int id) {
		Member member = memberDao.searchById(id);
		return member;
	}

	public void update(Member member) {
		memberDao.update(member);
	}

	public void delete(int id) {
		memberDao.delete(id);
	}
	
		
	
}
