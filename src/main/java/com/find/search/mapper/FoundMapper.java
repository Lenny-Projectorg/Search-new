package com.find.search.mapper;

import com.find.search.entity.Found;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoundMapper {
    //查询所有失物招领
    List<Found> selectAllFound();

    //查询指定用户发布的失物招领
    List<Found> selectFoundByUserId(Found found);

    //添加失物招领
    Integer insertFound(Found found);

    //修改失物招领信息
    Integer updateFound(Found found);

    //删除失物招领信息
    Integer deleteFoundByFoundId(Integer foundId);
}
