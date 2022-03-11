package com.going;

import com.going.mybatis.GoingMapperScan;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

/**
 * Description: AppConfig
 * Created on 2022/3/9.
 *
 * @author go
 */
@GoingMapperScan("com.going.mapper")
@ComponentScan("com.going")
public class AppConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        return sqlSessionFactoryBuilder.build(Resources.getResourceAsStream("mybatis.xml"));
    }

}
