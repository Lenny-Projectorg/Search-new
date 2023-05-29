package com.find.search.service;

import com.find.search.entity.Goods;
import java.util.HashMap;
import java.util.List;

public interface GoodsService {

    //查询所有寻物启事
    List<Goods> selectAllGoods(Goods goods);
    //分页查询所有寻物启事方法:两个参数：页码，每页条数
    HashMap<String, Object> findGoodsByPage(Integer page, Integer pageRow,Goods goods);

    //查询指定用户发布的寻物启事
    List<Goods> selectGoodsByUserId(Goods goods);

    //分页查询指定用户发布的寻物启事
    HashMap<String,Object> findUserIdGoodsByPage(Integer page, Integer pageRow,Goods goods);

    //修改寻物启事数据
    HashMap<String,Object> updateGoods(Goods goods);

    //删除指定寻物启事
    HashMap<String,Object> deleteGoodsByGoodsId(Integer goodsId);

    //添加寻物启事
    HashMap<String,Object> insertGoods(Goods goods);
}
