package com.gsm.service.impl;

import com.gsm.dao.UserDao;
import com.gsm.po.User;
import com.gsm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public Map<String, Object> selectUser() {
        User user = userDao.selectUser();
        Map<String,Object> map = new HashMap();
        map.put("user",user);
        return map;
    }
}