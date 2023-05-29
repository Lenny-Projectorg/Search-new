package com.find.search.service.impl;

import com.find.search.entity.Humanity;
import com.find.search.entity.User;
import com.find.search.mapper.HumanityMapper;
import com.find.search.mapper.UserMapper;
import com.find.search.service.HumanityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class HumanityServiceImpl implements HumanityService {
    @Autowired
    private HumanityMapper humanityMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Humanity> selectAllHumanity() {
        return humanityMapper.selectAllHumanity();
    }


    /**
     * 分页查询所有寻人启事数据
     * @param page
     * @param pageRow
     * @return
     */
    @Override
    public HashMap<String, Object> findByPage(Integer page, Integer pageRow) {
        HashMap<String,Object> map=new HashMap<>();
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Humanity> list=humanityMapper.selectAllHumanity();
        //创建分页对象，把list集合放入
        PageInfo<Humanity> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;
    }

    /**
     * 分页查询指定用户发布寻人启事
     * @param page
     * @param pageRow
     * @return
     */
    @Override
    public HashMap<String, Object> findPersonByPage(Integer page, Integer pageRow,String userEmail) {
        HashMap<String,Object> map=new HashMap<>();
        //获取用户id
        User user = userMapper.selectByUserEmail(userEmail);
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Humanity> list=humanityMapper.selectHumanityByUserId(user.getUserId());
        //创建分页对象，把list集合放入
        PageInfo<Humanity> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;
    }

    /**
     * 查询指定用户发布的寻人启事
     * @param
     * @return
     */
    @Override
    public List<Humanity> selectHumanityByUserId(String userEmail) {
        //通过用户邮箱获取用户id(userId)
        User user = userMapper.selectByUserEmail(userEmail);

        //通过用户id查询该用户发布的寻人启事
        List<Humanity> humanityList = humanityMapper.selectHumanityByUserId(user.getUserId());

        return humanityList;
    }

    /**
     * 更新寻人启事信息
     * @param humanity
     * @return
     */
    @Override
    public HashMap<String, Object> updateHumanityInfo(Humanity humanity) {
        System.out.println(humanity.getHumanityBirthday());
        System.out.println(humanity.getHumanityDistime());
        //创建返回类型集合
        HashMap<String, Object> map = new HashMap<>();
        //修改数据
        Integer i = humanityMapper.updateHumanityInfo(humanity);
        //判断是否修改成功
        if(i>0){
            map.put("info","修改成功");
            return map;
        }
        map.put("info","修改失败");
        return map;
    }

    @Override
    public HashMap<String,Object> delHumanity(Integer humanityId){
        HashMap<String, Object> map = new HashMap<>();
        //根据humanityId删除寻人启事信息
        Integer i = humanityMapper.delHumanity(humanityId);
        //判断是否删除成功
        if (i>0){
            map.put("info","删除成功");
        }else {
            map.put("info","删除失败");
        }
        return map;
    }

    /**
     * 添加寻人启事
     * @param humanity
     * @param userEmail
     * @return
     */
    @Override
    public HashMap<String,Object> insertHumanity(Humanity humanity,String userEmail){
        HashMap<String, Object> map = new HashMap<>();
        //获取用户id
        User user = userMapper.selectByUserEmail(userEmail);
        //判断用户id是否存在
        if(user.getUserId()==null){
            map.put("info","未查询到该用户");
            return map;
        }
        //补全寻人启事信息
        humanity.setUserId(user.getUserId());
        humanity.setHumanitySuccess("未找到");//将0改为未找到
        //向数据库插入信息
        Integer i = humanityMapper.insertHumanity(humanity);
        //判断是否插入成功
        if(i>0){
            map.put("info","添加成功");
        }else {
            map.put("info","添加失败");
        }
        return map;
    }
}
