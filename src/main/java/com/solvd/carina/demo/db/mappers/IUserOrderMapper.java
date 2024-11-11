package com.solvd.carina.demo.db.mappers;

import com.solvd.carina.demo.db.models.User;
import com.solvd.carina.demo.db.models.Orders;

import java.util.List;

public interface IUserOrderMapper {
    Orders findById(Long id);

    List<Orders> findOrdersByUserId(long id);

    List<User> findUserByOrderId(long id);
}
