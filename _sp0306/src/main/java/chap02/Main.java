package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				//.class는 Class 실물을 의미한다
				new AnnotationConfigApplicationContext(AppContext.class);
		//main에서 객체 생성을 하지 않는다는 의미
		//달라고 할 때 객체를 달라는 의미
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("자고 싶다");
		System.out.println(msg);
		ctx.close();
	}

}
