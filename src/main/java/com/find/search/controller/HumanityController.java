package com.find.search.controller;

import com.find.search.entity.Humanity;
import com.find.search.service.HumanityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/humanity")
public class HumanityController {
    @Autowired
    HumanityService humanityService;

    @PostMapping("/selectAll")//查询所有寻人启事
    public List<Humanity> selectAllHumanity(@RequestBody Humanity humanity){
        return humanityService.selectAllHumanity(humanity);
    }

    @PostMapping("/findByPage")//分页查询所有寻人启事
    public HashMap<String,Object> findByPage(@RequestBody Humanity humanity){
        Integer page = humanity.getPage();
        Integer pageRow = humanity.getPageRow();
//        System.out.println("page:"+page+"-------"+"pageRow:"+pageRow);
        return humanityService.findByPage(page,pageRow,humanity);
    }


    @PostMapping("/selectHumanityByUserId")//通过邮箱查询用户id
    public List<Humanity> selectHumanityByUserId(@RequestBody Humanity humanity){
//        System.out.println("userEmail:"+userEmail);
        return humanityService.selectHumanityByUserId(humanity);
    }


    @PostMapping("/findPersonByPage")//分页查询指定用户发布的寻人启事
    public HashMap<String,Object> findPersonByPage(@RequestBody Humanity humanity){
        Integer page = humanity.getPage();
        Integer pageRow = humanity.getPageRow();
//        System.out.println("page:"+page+"-"+"pageRow:"+pageRow+"-"+"userEmail:"+userEmail);
        return humanityService.findPersonByPage(page,pageRow,humanity);
    }


    @PostMapping("/updateHumanityInfo")//修改寻人启事信息
    public HashMap<String,Object> updateHumanityInfo(@RequestBody Humanity humanity){
//        System.out.println(humanity.getHumanityId()+" "+humanity.getHumanityName());
        return humanityService.updateHumanityInfo(humanity);
    }

    @GetMapping("/delHumanity")
    public HashMap<String,Object> delHumanity(Integer humanityId){
//        System.out.println(humanityId);
        return  humanityService.delHumanity(humanityId);
    }

    @PostMapping("/insertHumanity{userEmail}")
    public HashMap<String,Object> insertHumanity(@RequestBody Humanity humanity,@PathVariable String userEmail){

        System.out.println(humanity.getHumanityName());
        System.out.println(humanity.getHumanityBirthday());
        System.out.println(humanity.getHumanityDistime());
        return humanityService.insertHumanity(humanity,userEmail);
    }

}
