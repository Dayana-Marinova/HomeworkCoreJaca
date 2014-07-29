package hackBulgaria.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface ClassInfo {
	
	String[] author() default {"Goro", "ivo", "Rado"};
	
	int revision() default 1;
	
	boolean checked() default true;
	
	Class<?>[] related();
}
