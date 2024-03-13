package anno1;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		//MyObject 클래스에 가서 declared된 methods 정보를 가지고 와라.
		Method[] methodList = MyObject.class.getDeclaredMethods();
		
		for (Method method : methodList) {
			if(method.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
				String value = annotation.value();
				System.out.println(method.getName() + " : " + value);
			}
		}
	}

}
