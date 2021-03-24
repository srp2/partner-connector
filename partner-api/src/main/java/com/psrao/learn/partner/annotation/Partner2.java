package com.psrao.learn.partner.annotation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
//{ElementType.TYPE, ElementType.METHOD}
@Retention(RetentionPolicy.RUNTIME)
@ConditionalOnProperty(prefix = "partner", name = "name", havingValue = "Partner2")
public @interface Partner2 {}
