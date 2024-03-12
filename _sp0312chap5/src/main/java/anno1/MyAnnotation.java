package anno1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**method에만 붙일 수 있는 annotation 만듦**/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "MyAnnotation : default value";
}
