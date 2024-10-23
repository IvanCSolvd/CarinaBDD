package com.solvd.carina.demo.db.mappers;

import com.solvd.carina.demo.db.models.User;
import com.solvd.carina.demo.db.models.UserOrder;

import java.util.List;

public interface IUserOrderMapper {
    UserOrder findById(Long id);

    List<UserOrder> findOrdersByUserId(long id);

    List<User> findUserByOrderId(long id);
}
