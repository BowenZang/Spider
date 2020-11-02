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
public @interface Method {

    String name();

    Argument[] arguments() default {};

}
