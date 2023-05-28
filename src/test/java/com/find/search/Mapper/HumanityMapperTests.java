package com.find.search.Mapper;

import com.find.search.entity.Humanity;
import com.find.search.service.HumanityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class HumanityMapperTests {
    @Autowired
    HumanityService humanityService;

    @Test
    public void selectAllHumanity(){
        List<Humanity> humanities = humanityService.selectAllHumanity();
        for (Humanity humanity : humanities) {
            System.out.println(humanity.getHumanityId()+humanity.getHumanityName());
        }
    }
    //查询指定用户的寻人启事
    @Test
    public void selectHumanityByUserId(){
        String userEmail="admin@qq.com";
        List<Humanity> humanityList = humanityService.selectHumanityByUserId(userEmail);
        for (Humanity humanity : humanityList) {
            System.out.println(humanity.getHumanityId()+" "+humanity.getHumanityName()+" "+humanity.getUserId());
        }
    }
}
