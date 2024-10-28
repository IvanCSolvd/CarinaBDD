package com.solvd.carina.demo.utils;

import com.solvd.carina.demo.db.mappers.IUserMapper;
import com.solvd.carina.demo.db.mappers.IUserOrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class ConnectionDataBase {
    private static SqlSessionFactory factory;

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis_config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

    public static IUserMapper getUserMapper() {
        return ConnectionDataBase.getSqlSessionFactory().openSession(true).getMapper(IUserMapper.class);
    }

    public static IUserOrderMapper getUserOrderMapper() {
        return ConnectionDataBase.getSqlSessionFactory().openSession(true).getMapper(IUserOrderMapper.class);
    }
}
