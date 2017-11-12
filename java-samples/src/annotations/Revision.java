package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Revision {
    int major() default 1;
    int minor() default 0;
}
