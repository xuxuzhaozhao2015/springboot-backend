package com.example.demo.mapper;

import com.example.demo.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface IUserInfoMapper {
    UserInfo selectById(@Param("id") Integer id);

    void insert(@Param("user_name")String username);
}
