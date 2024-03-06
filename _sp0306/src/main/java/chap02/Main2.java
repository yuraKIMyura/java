package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		String msg1 = g1.greet("SQLD");
		String msg2 = g2.greet("리눅스");
		System.out.println(msg1);
		System.out.println(msg2);
		ctx.close();
	}

}
