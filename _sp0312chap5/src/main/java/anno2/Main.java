package anno2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import anno1.MyAnnotation;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
		/**아래 두 줄의 코드를 아래 네 줄의 코드로 대체가 가능하다**/
		//Target ta = new Target();
		//ta.sub();
		
		String className = "anno2.Target";
		Class<?> cls = Class.forName(className);
		Target a = (Target) cls.getDeclaredConstructor().newInstance();
		a.sub();
		
		
		Method[] methods = cls.getDeclaredMethods();
		for (int i =0; i < methods.length; i++) {
			if (methods[i].isAnnotationPresent(MyAnno.class)) {
				MyAnno myAnno = methods[i].getAnnotation(MyAnno.class);
				System.out.println(myAnno.value());
			}
			if (methods[i].isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation myAnnotation = methods[i].getAnnotation(MyAnnotation.class);
				String value = myAnnotation.value();
				System.out.println(methods[i].getName() + " : " + value );
			}
			
		}
		
		
		/**"Target" 클래스에서 이름이 "sub"인 메소드의 annotation 가져오기**/
		Method method = Target.class.getMethod("sub");
		Annotation[] annotations = method.getDeclaredAnnotations();
		
		for (Annotation anno : annotations) {
			MyAnno myAnno = (MyAnno) anno;
			System.out.println(myAnno.value());
			/**ClassCastException은 **/
		}//for
		
	}//main

}//class
