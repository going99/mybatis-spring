package com.going.mybatis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: GoingMapperScan
 * Created on 2022/3/9.
 *
 * @author go
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(GoingImportBeanDefinitionRegistrar.class)
public @interface GoingMapperScan {

    String value();

}
