package com.find.search.controller;

import com.find.search.entity.Found;
import com.find.search.service.FoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/found")
public class FoundController {
    @Autowired
    FoundService foundService;

    @GetMapping("/selectAllFound")
    public List<Found> selectAllFound(){
        return foundService.selectAllFound();
    }

    @GetMapping("/findFoundByPage")
    public HashMap<String,Object> findFoundByPage(Integer page, Integer pageRow){
        return foundService.findFoundByPage(page,pageRow);
    }

    @PostMapping("/selectFoundByUserId")//查询指定用户发布的失物招领
    public List<Found> selectFoundByUserId(@RequestBody Found found){
        return foundService.selectFoundByUserId(found);
    }

    @PostMapping("/findUserIdFoundByPage")//分页查询指定用户发布的失物招领
    public HashMap<String,Object> findUserIdFoundByPage(@RequestBody Found found){
        Integer page = found.getPage();
        Integer pageRow = found.getPageRow();
        return foundService.findUserIdFoundByPage(page,pageRow,found);
    }

    @PostMapping("/insertFound")
    public HashMap<String,Object> insertFound(@RequestBody Found found){
        return foundService.insertFound(found);
    }

    @PostMapping("/updateFound")
    public HashMap<String,Object> updateFound(@RequestBody Found found){
        return foundService.updateFound(found);
    }
}
