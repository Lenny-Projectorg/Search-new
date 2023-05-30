package com.find.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//视图控制器（返回、渲染页面）
public class ViewController extends BaseController{
    //注册界面
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    //登录界面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //寻人启事界面
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //寻物界面
    @RequestMapping("/goodsView")
    public String goods(){
        return "goods";
    }

    //失物招领界面
    @RequestMapping("/foundView")
    public String found(){
        return "found";
    }

    //发布寻人界面
    @RequestMapping("/personView")
    public String person(){
        return "person";
    }

    //发布寻物界面
    @RequestMapping("/findGoodsView")
    public String findGoods(){
        return "findGoods";
    }

    //发布失物招领界面
    @RequestMapping("/lostView")
    public String lost(){
        return "lost";
    }

    //个人信息界面
    @RequestMapping("/userInfo")
    public String userInfo(){
        return "userInfo";
    }

    //修改密码界面
    @RequestMapping("/editPassword")
    public String editPassword(){
        return "editPassword";
    }
}
