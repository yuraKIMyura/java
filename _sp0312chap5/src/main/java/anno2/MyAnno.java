package anno2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**적용대상: method**/
@Target(ElementType.METHOD)
/**유지정책: runtime, 컴파일 이후에도 JVM이 참조**/
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnno {
	/**String 타입으로 사용 가능**/
	public String value();
}
