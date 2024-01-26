//2 equals(), hashCode(), toString() method
//equals()와 hashCode() 재정의를 통한 instance 동일성 판별 기준 수립
package part01.javalang;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "member instance ["+id+"]";
	}


	//(custom) id가 같으면 같은 instance인 것으로 판단한다
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}//method	
	
	//(custom) id가 같으면 같은 instance인 것으로 판단한다
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}//class
