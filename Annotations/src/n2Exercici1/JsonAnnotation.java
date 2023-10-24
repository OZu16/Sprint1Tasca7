package n2Exercici1;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonAnnotation {
	
	String directory() default "C:\\Users\\Gerard\\Desktop\\countries";


}

