package com.going;

import com.going.config.UserManager;
import com.going.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Description: Test
 * Created on 2022/3/9.
 *
 * @author go
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        UserService userService = context.getBean(UserService.class);
        userService.test1();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        int beanDefinitionCount = context.getBeanDefinitionCount();
        Map<String, UserManager> beansOfType = context.getBeansOfType(UserManager.class);
        System.out.println("beanDefinitionCount = " + beanDefinitionCount);
    }

}
