package hackBulgaria.Annotation;

import java.lang.annotation.Annotation;

@ClassInfo(related = {Integer.class, String.class})
public class NewClass {
	public static void main(String[] args) {
		
		ClassInfo classinfo = NewClass.class.getAnnotation(ClassInfo.class);
		Annotation[] classinfo1 = NewClass.class.getAnnotations();
		System.out.println(classinfo);
		
		for (Annotation annotation : classinfo1){
			System.out.println(annotation);
		}
	}
}
