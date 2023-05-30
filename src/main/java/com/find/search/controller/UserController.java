package com.find.search.controller;

import com.find.search.entity.User;
import com.find.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public HashMap<String,Object> login(@RequestBody User user, HttpSession session){
        HashMap<String, Object> map = userService.selectLogin(user, session);
        if(!(map.get("info").equals("该邮箱未注册")||map.get("info").equals("密码错误"))){
            System.out.println("session的Uid:"+getUidFromSession(session));
            System.out.println("session的username:"+getUserEmailSession(session));
        }
        return map;
    }

    @GetMapping("/sendCode")
    public HashMap<String,Object> sendCode(String userEmail){
//        System.out.println(userEmail);
        return userService.sendCode(userEmail);
    }

    @GetMapping("/sendPasswordCode")
    public HashMap<String,Object> sendPasswordCode(String userEmail){
        return userService.sendPasswordCode(userEmail);
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

    @PostMapping("/editUserInfo")
    public HashMap<String,Object> editUserInfo(@RequestBody User user){
        return userService.editUserInfo(user);
    }

    @PostMapping("/editUserPassword")
    public HashMap<String,Object> editUserPassword(@RequestBody User user){
        return userService.editUserPassword(user);
    }

    @RequestMapping("/outLogin")
    public HashMap<String,Object> outLogin(HttpServletRequest request){
        HashMap<String, Object> map = new HashMap<>();
        //清除用户登录Session
        request.getSession().removeAttribute("uid");
        request.getSession().removeAttribute("userEmail");
        map.put("indo","退出成功");
        return map;
    }
}
