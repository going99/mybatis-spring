package com.going.mybatis;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * Description: 扩展导入bean定义注册器
 * Created on 2022/3/9.
 *
 * @author go
 */
public class GoingImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
                                        BeanNameGenerator beanNameGenerator) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(GoingMapperScan.class.getName());
        String path = (String) attributes.get("value");
        GoingBeanDefinitionScanner scanner = new GoingBeanDefinitionScanner(registry);
        scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
        scanner.doScan(path);
    }

}
