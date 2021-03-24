package com.psrao.learn.partner.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.AliasFor;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
//{ElementType.TYPE, ElementType.METHOD}
@Retention(RetentionPolicy.RUNTIME)
@ConditionalOnProperty(prefix = "partner", name = "name", havingValue = "Partner1")
public @interface Partner1 {}
