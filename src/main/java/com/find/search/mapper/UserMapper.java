package com.find.search.mapper;

import com.find.search.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //用户注册
    Integer insertUser(User user);

    //通过邮箱查询用户信息
    User selectByUserEmail(String userEmail);

    //通过邮箱和密码查询用户
    User selectLoginIndo(String userEmail,String userPassword);

    //修改用户信息
    Integer editUserInfo(User user);

    //修改用户密码
    Integer editUserPassword(User user);
}
