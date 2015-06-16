# AnnotationTest
How to use Annotation

#1.Add @interface

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DeclareView {
	int id() default 0;
	String name() default "";
	String tag() default "";
	String click() default "";
	String setText() default "";
}

