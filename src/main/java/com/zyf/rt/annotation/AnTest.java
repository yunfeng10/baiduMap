package com.zyf.rt.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnTest {
    int index() default 0;

    String format() default "";
}
