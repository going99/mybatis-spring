package com.going.service;

import com.going.mapper.OrderMapper;
import com.going.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description: UserService
 * Created on 2022/3/9.
 *
 * @author go
 */
@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrderMapper orderMapper;

    public void test1(){
        System.out.println("UserService::test1() is called");
        String userId = userMapper.getUserId();
        System.out.println("userId = " + userId);
        String orderId = orderMapper.getOrderId();
        System.out.println("orderId = " + orderId);
    }

}
