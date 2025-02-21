package com.spring.aop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // Apply only to methods
@Retention(RetentionPolicy.RUNTIME)  // Retain at runtime
public @interface Mask {
}
