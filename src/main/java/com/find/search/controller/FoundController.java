package com.find.search.controller;

import com.find.search.entity.Found;
import com.find.search.service.FoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/found")
public class FoundController extends BaseController{
    @Autowired
    FoundService foundService;

    @PostMapping("/selectAllFound")
    public List<Found> selectAllFound(@RequestBody Found found){
        return foundService.selectAllFound(found);
    }

    @PostMapping("/findFoundByPage")
    public HashMap<String,Object> findFoundByPage(@RequestBody Found found){

        Integer page = found.getPage();
        Integer pageRow = found.getPageRow();

        return foundService.findFoundByPage(page,pageRow,found);
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

    @GetMapping("/deleteFound")
    public HashMap<String,Object> deleteFoundByFoundId(Integer foundId){
        return foundService.deleteFoundByFoundId(foundId);
    }
}
