//240112 enum constructor를 사용해서 가격 불러오는 기능
//이런 건 class나 interface로 하는 게 아님!

package enumStudy;

public enum WhiteshipLectureList {
	THE_JAVA_JAVA_8(55000),    
	THE_JAVA_CODE_MANIPULATION(49500),    
	THE_JAVA_APPLICATION_TEST(66000),    
	SPRING_FRAMEWORK_INTRODUCTION(0),    
	SPRING_FRAMEWORK_INTRODUCTION_REVISED_EDITION(0),    
	SPRING_FRAMEWORK_CORE(55000),   
	SPRING_FRAMEWORK_WEB_MVC(110000),    
	SPRING_BOOT(110000),    
	SPRING_BOOT_UPDATED(66000),   
	SPRING_AND_JPA_BASED_WEB_APPLICATION_DEVELOPMENT(330000),    
	SPRING_SECURITY(88000),    
	REST_API(99000),   
	SPRING_DATA_JPA(88000),   
	INTERVIEW_GUIDE_SOFTWARE_DEVELOPMENT_ENGINEER(220000);        
	
	private int amount;       
	
	WhiteshipLectureList(int amount) {
		this.amount = amount;    
	}        
	
	public int getAmount() {
		return this.amount;    
	}
	
}
