package com.find.search.service.impl;

import com.find.search.entity.Goods;
import com.find.search.entity.Humanity;
import com.find.search.entity.User;
import com.find.search.mapper.GoodsMapper;
import com.find.search.mapper.UserMapper;
import com.find.search.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有寻物启事
     * @return
     */
    @Override
    public List<Goods> selectAllGoods() {
        return goodsMapper.selectAllGoods();
    }

    /**
     * 分页查询所有寻物启事
     * @param page
     * @param pageRow
     * @return
     */
    @Override
    public HashMap<String, Object> findGoodsByPage(Integer page, Integer pageRow) {
        HashMap<String,Object> map=new HashMap<>();
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Goods> list=goodsMapper.selectAllGoods();
        //创建分页对象，把list集合放入
        PageInfo<Goods> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;
    }

    /**
     * 查询指定用户发布的寻物启事
     * @param goods
     * @return
     */
    @Override
    public List<Goods> selectGoodsByUserId(Goods goods){
        //查询该用户发布的寻物启事信息
        List<Goods> goodsList = goodsMapper.selectGoodsByUserId(goods);
        return goodsList;
    }

    /**
     * 分页查询指定用户发布的寻物启事
     * @param page
     * @param pageRow
     * @param goods
     * @return
     */
    @Override
    public HashMap<String,Object> findUserIdGoodsByPage(Integer page,Integer pageRow,Goods goods){
        HashMap<String,Object> map=new HashMap<>();
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Goods> list=goodsMapper.selectGoodsByUserId(goods);
        //创建分页对象，把list集合放入
        PageInfo<Goods> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;
    }

    /**
     * 修改寻物启事数据
     * @return
     */
    @Override
    public HashMap<String,Object> updateGoods(Goods goods){
        HashMap<String, Object> map = new HashMap<>();
        Integer i = goodsMapper.updateGoods(goods);
        if(i>0){
            map.put("info","修改成功");
        }else{
            map.put("info","修改失败");
        }
        return map;
    }

    /**
     * 删除指定寻物启事
     * @return
     */
    @Override
    public HashMap<String, Object> deleteGoodsByGoodsId(Integer goodsId) {
        HashMap<String, Object> map = new HashMap<>();

        Integer i = goodsMapper.deleteGoodsByGoodsId(goodsId);
        if(i>0){
            map.put("info","删除成功");
        }else {
            map.put("info","删除失败");
        }
        return map;
    }

    /**
     * 添加寻物启事
     * @param goods
     * @return
     */
    @Override
    public HashMap<String, Object> insertGoods(Goods goods) {
        HashMap<String, Object> map = new HashMap<>();

        Integer i = goodsMapper.insertGoods(goods);
        if(i>0){
            map.put("info","添加成功");
        }else {
            map.put("info","添加失败");
        }
        return map;
    }
}
