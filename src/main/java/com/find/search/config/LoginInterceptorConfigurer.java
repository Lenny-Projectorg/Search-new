package com.find.search.config;

import com.find.search.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration//自动加载拦截器配置类
public class LoginInterceptorConfigurer implements WebMvcConfigurer {

    /**
     * 拦截器配置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建一个拦截器对象
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        //添加白名单
        List<String> patters = new ArrayList<String>();
        patters.add("/res/**");
        patters.add("/css/**");
        patters.add("/images/**");
        patters.add("/js/**");
        patters.add("/login");
        patters.add("/register");
        patters.add("/index");
        patters.add("/goodsView");
        patters.add("/foundView");
        patters.add("/user/login");
        patters.add("/user/sendCode");
        patters.add("/user/register");
        patters.add("/found/selectAllFound");
        patters.add("/found/findFoundByPage");
        patters.add("/goods/selectAllGoods");
        patters.add("/goods/findGoodsByPage");
        patters.add("/humanity/selectAll");
        patters.add("/humanity/findByPage");
        //通过注册工具添加拦截器
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns(patters);
    }
}
