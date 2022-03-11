package com.going.mybatis;

import com.going.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description: GoingFactoryBean
 * Created on 2022/3/9.
 *
 * @author go
 */
public class GoingFactoryBean implements FactoryBean {

    private Class mapperInterface;
    public SqlSession sqlSession;

    public GoingFactoryBean(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }
    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addMapper(mapperInterface);
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {
        return sqlSession.getMapper(mapperInterface);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

}
