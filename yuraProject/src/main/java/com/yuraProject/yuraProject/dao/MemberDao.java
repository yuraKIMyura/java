package com.yuraProject.yuraProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.yuraProject.yuraProject.dto.Member;


@Repository
public class MemberDao {
	

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Member> selectAll() {
		List<Member> allList = jdbcTemplate.query(
				"select * from MEMBER",
				new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getInt("age"),
								rs.getString("email"),
								rs.getString("memo"));
						return member;
					}
				});

		return allList;
	}
			
	public Member selectByName(String name) {
		Member result = jdbcTemplate.queryForObject(
				"select * from MEMBER where NAME = ?",
				(ResultSet rs, int rowNum) -> {
						Member member = new Member(
								rs.getInt("id"),
								rs.getString("name"),
								rs.getInt("age"),
								rs.getString("email"),
								rs.getString("memo"));								
						return member;
				}, name);
		return result;
	}

	public int register(Member member) {
		int result = jdbcTemplate.update("INSERT INTO MEMBER (name, age, email, memo) VALUES (?, ?, ?, ?)",
				member.getName(), member.getAge(), member.getEmail(), member.getMemo());
		return result;
	}

	public Member searchById(int id) {
		Member foundMember = jdbcTemplate.queryForObject("SELECT * FROM MEMBER WHERE ID = ?", (ResultSet rs, int rowNum) -> {
			Member member = new Member(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"), rs.getString("memo")); return member;
		}, id);
		return foundMember;
	}

	public void update(Member member) {
		jdbcTemplate.update("update member set name = ?, age = ?, email = ?, memo = ? where id = ?", 
				member.getName(), member.getAge(), member.getEmail(), member.getMemo(), member.getId());	
	}

	public void delete(int id) {
		jdbcTemplate.update("delete from member where id = ?", id);
		
	}
	
	
}
