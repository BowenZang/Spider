package com.bowenzang.spider.config.annotation;

import java.lang.annotation.*;

/**
 * @author Mark
 * @since 1.0.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
@Inherited
public @interface Argument {

    // Argument: index -1 represents not set
    int index() default -1;

    // Argument type
    String type() default "";

    // Callback interface ？？？ TODO
    boolean callback() default false;

}
