package com.find.search.controller;

import com.find.search.entity.Goods;
import com.find.search.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController extends BaseController{
    @Autowired
    GoodsService goodsService;

    @PostMapping("/selectAllGoods")
    public List<Goods> selectAllHumanity(@RequestBody Goods goods){
        return goodsService.selectAllGoods(goods);
    }

    @PostMapping("/findGoodsByPage")//分页查询所有寻物启事
    public HashMap<String,Object> findGoodsByPage(@RequestBody Goods goods){
        Integer page = goods.getPage();
        Integer pageRow = goods.getPageRow();
//        System.out.println("page:"+page+"-------"+"pageRow:"+pageRow);
        return goodsService.findGoodsByPage(page,pageRow,goods);
    }

    @PostMapping("/selectGoodsByUserId")//查询指定用户发布的寻物启事
    public List<Goods> selectGoodsByUserId(@RequestBody Goods goods){
//        System.out.println(goods.getUserId());
        return goodsService.selectGoodsByUserId(goods);
    }

    @PostMapping("/findUserIdGoodsByPage")//分页查询指定用户发布的寻物启事
    public HashMap<String,Object> findUserIdGoodsByPage(@RequestBody Goods goods){
        Integer page = goods.getPage();
        Integer pageRow = goods.getPageRow();
        return goodsService.findUserIdGoodsByPage(page,pageRow,goods);
    }


    @PostMapping("/updateGoods")//更新寻物启事信息
    public HashMap<String,Object> updateGoods(@RequestBody Goods goods){
        return goodsService.updateGoods(goods);
    }

    @GetMapping("/deleteGoods")//删除寻物启事信息
    private HashMap<String,Object> deleteGoodsByGoodsId(Integer goodsId){
        System.out.println(goodsId);
        return goodsService.deleteGoodsByGoodsId(goodsId);
    }

    @PostMapping("/insertGoods")//添加寻物启事信息
    public HashMap<String,Object> insertGoods(@RequestBody Goods goods){
        return goodsService.insertGoods(goods);
    }
}
