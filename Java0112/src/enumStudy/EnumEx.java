package enumStudy;

public class EnumEx {

	public static void main(String[] args) {
		 WhiteshipLectureList list = WhiteshipLectureList.SPRING_FRAMEWORK_CORE; 
		 System.out.println(list + " 수강료는 " + list.getAmount() + "(원) 입니다.");
	}

}
