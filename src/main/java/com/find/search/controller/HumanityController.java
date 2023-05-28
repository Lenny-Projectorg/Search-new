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

    @GetMapping("/selectAll")//查询所有寻人启事
    public List<Humanity> selectAllHumanity(){
        return humanityService.selectAllHumanity();
    }

    @GetMapping("/findByPage")//分页查询所有寻人启事
    public HashMap<String,Object> findByPage(Integer page, Integer pageRow){
//        System.out.println("page:"+page+"-------"+"pageRow:"+pageRow);
        return humanityService.findByPage(page,pageRow);
    }


    @PostMapping("/selectHumanityByUserId")//通过邮箱查询用户id
    public List<Humanity> selectHumanityByUserId(String userEmail){
//        System.out.println("userEmail:"+userEmail);
        return humanityService.selectHumanityByUserId(userEmail);
    }


    @GetMapping("/findPersonByPage")//分页查询指定用户发布的寻人启事
    public HashMap<String,Object> findPersonByPage(Integer page, Integer pageRow,String userEmail){
//        System.out.println("page:"+page+"-"+"pageRow:"+pageRow+"-"+"userEmail:"+userEmail);
        return humanityService.findPersonByPage(page,pageRow,userEmail);
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
