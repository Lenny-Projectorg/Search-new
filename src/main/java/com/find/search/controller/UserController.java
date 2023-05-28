package com.find.search.controller;

import com.find.search.entity.User;
import com.find.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public HashMap<String,Object> login(@RequestBody User user){

        return userService.selectLogin(user);
    }

    @GetMapping("/sendCode")
    public HashMap<String,Object> sendCode(String userEmail){
        System.out.println(userEmail);
        return userService.sendCode(userEmail);
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/register")
    public HashMap<String,Object> register(@RequestBody User user){
        return userService.insertUser(user);
    }

    /**
     * 通过邮箱获取用户ID
     * @param userEmail
     * @return
     */
    @GetMapping("/getUserId")
    public HashMap<String,Object> selectByUserEmail(String userEmail){
        return userService.selectByUserEmail(userEmail);
    }

    //查询用户信息
    @GetMapping("/selectUser")
    public HashMap<String,Object> selectUser(String userEmail){
        return userService.selectUser(userEmail);
    }
}
