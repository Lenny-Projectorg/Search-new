package com.find.search.controller;

import javax.servlet.http.HttpSession;

public class BaseController {

    /**
     * 从HttpSession 获取用户邮箱
     * @param session
     * @return
     */
    protected final String getUserEmailSession(HttpSession session){
        return session.getAttribute("userEmail").toString();
    }

    /**
     * 从HttpSession 获取Uid
     * @param session HttpSession对象
     * @return 当前登录用户的Uid
     */
    protected final Integer getUidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("uid").toString());
    }
}
