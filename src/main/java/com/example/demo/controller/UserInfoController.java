package com.example.demo.controller;

import com.example.demo.core.ret.RetResponse;
import com.example.demo.service.IUserInfoService;
import lombok.val;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("userinfo")
public class UserInfoController {

    @Resource
    private IUserInfoService userInfoService;

    @PostMapping("/selectById")
    public Object selectById(int id) {
        val userInfo = userInfoService.selectById(id);
        return RetResponse.Success(userInfo);
    }

    @PostMapping("/insert")
    public Object insert(String username){
        username=null;
        userInfoService.insert(username);
        return RetResponse.Success();
    }
}
