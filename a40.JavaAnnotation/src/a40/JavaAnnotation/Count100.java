package a40.JavaAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//JVM 실행시 감지 시키기 위해 아래 Annotation 추가
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {
		
}
