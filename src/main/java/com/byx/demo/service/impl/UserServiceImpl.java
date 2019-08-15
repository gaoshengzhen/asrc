package com.byx.demo.service.impl;

import com.byx.demo.entity.User;
import com.byx.demo.mapper.UserMapper;
import com.byx.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper service;

    public List<User> getByUserName(String userName, String password) {
        return service.getByUserName(userName,password);
    }
}
