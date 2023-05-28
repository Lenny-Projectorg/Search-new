package com.find.search.Mapper;

import com.find.search.entity.Goods;
import com.find.search.entity.Humanity;
import com.find.search.service.GoodsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class GoodsMapperTests {
    @Autowired
    GoodsService goodsService;

    @Test
    public void findAllGoods(){
        List<Goods> goods = goodsService.selectAllGoods();
        for (Goods good : goods) {
            System.out.println(good.getGoodsName()+good.getGoodsFeature());
        }
    }
}
