package com.example.demo.service;

import com.example.demo.domain.UserInfo;

public interface IUserInfoService {
    UserInfo selectById(Integer id);

    void insert(String username);
}
