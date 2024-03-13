package anno2;

import anno1.MyAnnotation;

public class Target {

	@MyAnno ( value = "아이스 아메리카노가 필요한 걸까요" )
	@MyAnnotation ( value = "아이스 아메리카노" )

	public void sub() {
		System.out.println("Target");
	}
	
}
