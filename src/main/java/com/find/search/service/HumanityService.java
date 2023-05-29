package com.find.search.service;

import com.find.search.entity.Humanity;
import org.apache.shiro.crypto.hash.Hash;

import java.util.HashMap;
import java.util.List;

public interface HumanityService {
    //查询所有寻人启事
    List<Humanity> selectAllHumanity(Humanity humanity);

    //分页查询方法:两个参数：页码，每页条数
    HashMap<String, Object> findByPage(Integer page, Integer pageRow,Humanity humanity);

    //指定用户发布寻人启事分页查询方法:两个参数：页码，每页条数
    HashMap<String, Object> findPersonByPage(Integer page, Integer pageRow,Humanity humanity);

    //通过输入用户邮箱查询指定用户发布的寻人启事
    List<Humanity> selectHumanityByUserId(Humanity humanity);

    //更新寻人启事信息
    HashMap<String,Object> updateHumanityInfo(Humanity humanity);

    //删除寻人启事
    HashMap<String,Object> delHumanity(Integer humanityId);

    HashMap<String,Object> insertHumanity(Humanity humanity,String userEmail);
}
