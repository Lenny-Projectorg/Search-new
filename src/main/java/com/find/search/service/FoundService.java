package com.find.search.service;

import com.find.search.entity.Found;
import java.util.HashMap;
import java.util.List;

public interface FoundService {
    //查询所有失物招领
    List<Found> selectAllFound(Found found);
    //分页查询所有失物招领方法:两个参数：页码，每页条数
    HashMap<String, Object> findFoundByPage(Integer page, Integer pageRow,Found found);

    //查询指定用户发布的失物招领
    List<Found> selectFoundByUserId(Found found);

    //分页查询指定用户发布的失物招领
    HashMap<String,Object> findUserIdFoundByPage(Integer page, Integer pageRow, Found found);

    //添加失物招领
    HashMap<String,Object> insertFound(Found found);

    //修改失物招领信息
    HashMap<String,Object> updateFound(Found found);

    //删除失物招领信息
    HashMap<String,Object> deleteFoundByFoundId(Integer foundId);
}
