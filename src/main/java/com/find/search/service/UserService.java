package com.find.search.service;

import com.find.search.entity.User;

import java.util.HashMap;

public interface UserService {
    //用户注册
    HashMap<String, Object> insertUser(User user);

    //登录验证查询
    HashMap<String, Object> selectLogin(User user);

    //发送验证码
    HashMap<String, Object> sendCode(String userEmail);

    //根据用户邮箱获取用户id
    HashMap<String,Object> selectByUserEmail(String userEmail);

    //查询指定用户信息
    HashMap<String, Object> selectUser(String userEmail);

    //修改用户信息
    HashMap<String,Object> editUserInfo(User user);

    //修改用户密码
    HashMap<String,Object> editUserPassword(User user);

    //发送修改密码的验证码
    HashMap<String, Object> sendPasswordCode(String userEmail);
}
