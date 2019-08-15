package com.byx.demo.service;

import com.byx.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> getByUserName(String userName, String password);
}
