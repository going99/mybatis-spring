package com.going.config;

import org.springframework.stereotype.Component;

/**
 * Description: UserManager
 * Created on 2022/3/9.
 *
 * @author go
 */
@Component(value = "userMan")
public class UserManager {

    private String userName;

    public UserManager(String userName) {
        System.out.println("user 非空构造方法 this = "+this);
        this.userName = userName;
    }

    public UserManager() {
        System.out.println("user 空构造方法 this = "+this);
    }

    public String getUserName() {
        return userName;
    }

}
