package com.find.search.service.impl;

import com.find.search.entity.Found;
import com.find.search.entity.Goods;
import com.find.search.mapper.FoundMapper;
import com.find.search.service.FoundService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class FoundServiceImpl implements FoundService {
    @Autowired
    private FoundMapper foundMapper;

    /**
     * 查询所有失物招领
     * @return
     */
    @Override
    public List<Found> selectAllFound() {
        return foundMapper.selectAllFound();
    }

    /**
     * 分页查询失物招领
     * @param page
     * @param pageRow
     * @return
     */
    @Override
    public HashMap<String, Object> findFoundByPage(Integer page, Integer pageRow) {
        HashMap<String,Object> map=new HashMap<>();
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Found> list=foundMapper.selectAllFound();
        //创建分页对象，把list集合放入
        PageInfo<Found> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;

    }

    /**
     * 查询指定用户发布的失物招领
     * @return
     */
    @Override
    public List<Found> selectFoundByUserId(Found found) {
        List<Found> list = foundMapper.selectFoundByUserId(found);
        return list;
    }

    /**
     * 查询指定用户发布的失物招领
     * @param page
     * @param pageRow
     * @param found
     * @return
     */
    @Override
    public HashMap<String, Object> findUserIdFoundByPage(Integer page, Integer pageRow, Found found) {
        HashMap<String,Object> map=new HashMap<>();
        //把页码和条数传入PageHelper
        PageHelper.startPage(page,pageRow);
        //确认分页的数据内容
        List<Found> list = foundMapper.selectFoundByUserId(found);
        //创建分页对象，把list集合放入
        PageInfo<Found> pageInfo=new PageInfo<>(list);
        //取出相关的数据
        map.put("list",pageInfo.getList());//取出当前页的数据
        map.put("total",pageInfo.getTotal());//取出所有条数
//        map.put("pages",pageInfo.getPages());//取出当前页码
        map.put("curPage",pageInfo.getPageNum());
        return map;
    }

    /**
     * 添加失物招领信息
     * @param found
     * @return
     */
    @Override
    public HashMap<String, Object> insertFound(Found found) {
        HashMap<String, Object> map = new HashMap<>();
        Integer i = foundMapper.insertFound(found);
        if (i>0){
            map.put("info","添加成功");
        }else {
            map.put("info","添加失败");
        }
        return map;
    }

    /**
     * 修改失物招领信息
     * @param found
     * @return
     */
    @Override
    public HashMap<String, Object> updateFound(Found found) {
        HashMap<String, Object> map = new HashMap<>();
        Integer i = foundMapper.updateFound(found);
        if(i>0){
            map.put("info","修改成功");
        }else {
            map.put("info","修改失败");
        }
        return map;
    }
}
