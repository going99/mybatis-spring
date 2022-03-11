package com.going.mapper;


import org.apache.ibatis.annotations.Select;

/**
 * Description: OrderMapper
 * Created on 2022/3/9.
 *
 * @author go
 */
public interface OrderMapper {

    @Select("select 'order2'")
    String getOrderId();

}
