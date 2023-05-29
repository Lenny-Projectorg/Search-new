package com.find.search.mapper;

import com.find.search.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {
    //查询所以失物招领
    List<Goods> selectAllGoods(Goods goods);

    //查询指定用户发布的寻物启事
    List<Goods> selectGoodsByUserId(Goods goods);

    //修改寻物启事数据
    Integer updateGoods(Goods goods);

    //删除指定寻物启事
    Integer deleteGoodsByGoodsId(Integer goodsId);

    //添加寻物启事
    Integer insertGoods(Goods goods);
}
