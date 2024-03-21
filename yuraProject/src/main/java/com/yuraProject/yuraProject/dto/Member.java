package com.yuraProject.yuraProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	private int id;
	private String name;
	private int age;
	private String email;
	private String memo;
	
}
