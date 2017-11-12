package annotations;

public @interface Revision {
    int major() default 1;
    int minor() default 0;
}
