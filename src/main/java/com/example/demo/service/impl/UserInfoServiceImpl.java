package com.example.demo.service.impl;

import com.example.demo.core.exception.ServiceException;
import com.example.demo.domain.UserInfo;
import com.example.demo.mapper.IUserInfoMapper;
import com.example.demo.service.IUserInfoService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private IUserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }

    @SneakyThrows
    @Override
    public void insert(String username) {
        throw new ServiceException("我是一个业务异常");
        //userInfoMapper.insert(username);
    }
}
