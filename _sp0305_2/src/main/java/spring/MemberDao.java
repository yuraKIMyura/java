package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		System.out.println(map.toString());
		return map.get(email);
	}
	
	public void insert(Member member) {
		System.out.println("[MemberDao] insert method 실행 시작");
		member.setId(++nextId);
		map.put(member.getEmail(), member);
		System.out.println("[MemberDao] insert method --- map.put result: " + map.toString());
	}
	
	public void update (Member member) {
		map.put(member.getEmail(), member);
		System.out.println("[MemberDao] change method --- map.put result: " + map.toString());
	}
	
	public Collection<Member> selectAll(){
		System.out.println("[MemberDao] selectAll method 실행 시작 || is map empty? "+map.isEmpty());
		System.out.println("[MemberDao] selectAll method --- map.values(): " + map.values());
		return map.values();
	}
	
}
