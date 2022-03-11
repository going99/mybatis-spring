package com.going.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: UserConfig
 * Created on 2022/3/9.
 *
 * @author go
 */
@Configuration
public class UserConfig {

    @Value("${user.name}")
    private String userName;

    @Bean(value = "userManageOrg")
    public UserManager userManager(){
        return new UserManager(userName);
    }

}
