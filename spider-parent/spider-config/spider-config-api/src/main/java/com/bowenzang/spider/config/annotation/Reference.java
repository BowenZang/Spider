package com.bowenzang.spider.config.annotation;

import java.lang.annotation.*;

/**
 * @author Mark
 * @since 1.0.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface Reference {

    /**
     * Interface class, default value is void.class
     */
    Class<?> interfaceClass() default void.class;

    /**
     * Interface class name, default value is empty string
     */
    String interfaceName() default "";

    /**
     * Service version, default value is empty string
     */
    String version() default "";

    /**
     * Service group, default value is empty string
     */
    String group() default "";

    /**
     * Service target URL for direct invocation, if this is specified, then registry center takes no effect
     */
    String url() default "";

    /**
     * Client transport type, default value is "netty"
     */
    String client() default "";

    /**
     * Whether to make connection when the client is created, the default value is false
     */
    boolean lazy() default false;

}
