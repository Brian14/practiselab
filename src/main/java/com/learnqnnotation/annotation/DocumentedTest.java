package com.learnqnnotation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * User: BAOBR
 * Date: 2/17/15
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface DocumentedTest {

    String hello();

}
