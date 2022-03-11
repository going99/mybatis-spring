package com.going.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * Description: UserMapper
 * Created on 2022/3/9.
 *
 * @author go
 */
public interface UserMapper {

    @Select("select username from auth_user where user_id=5")
    String getUserId();

}
