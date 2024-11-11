package com.solvd.carina.cucumber;

import com.solvd.carina.demo.db.mappers.IUserMapper;
import com.solvd.carina.demo.db.mappers.IUserOrderMapper;
import com.solvd.carina.demo.db.models.User;
import com.solvd.carina.demo.db.models.Orders;
import com.solvd.carina.demo.utils.ConnectionDataBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class DBUserTest implements IAbstractTest {
    @Test
    public void getUserIdTest() {
        try (SqlSession session = ConnectionDataBase.getSqlSessionFactory().openSession(true)) {
            IUserMapper userMapper = session.getMapper(IUserMapper.class);
            User user = userMapper.findById(1);
            System.out.println("Username: " + user.getUsername() + " password: " + user.getPassword());
            IUserOrderMapper userOrderMapper = session.getMapper(IUserOrderMapper.class);
            List<Orders> orders = userOrderMapper.findOrdersByUserId(1);
            System.out.println(orders.size());
            for (Orders a: orders) {
                System.out.println("Product Name: " + a.getProductName() + " - Product Price: " + a.getProductPrice());
            }
        }
    }
}
