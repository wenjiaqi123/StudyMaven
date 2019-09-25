package com.gsm.dao;

import com.gsm.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User selectUser();
}