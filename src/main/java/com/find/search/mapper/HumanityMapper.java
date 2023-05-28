package com.find.search.mapper;

import com.find.search.entity.Humanity;
import com.find.search.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface HumanityMapper {
    //查询所有寻人启事
    List<Humanity> selectAllHumanity();

    //查询指定用户发布的寻人启事
    List<Humanity> selectHumanityByUserId(Integer userId);

    //更新寻人启事信息
    Integer updateHumanityInfo(Humanity humanity);

    //删除寻人信息
    Integer delHumanity(Integer humanityId);

    //添加寻人启事
    Integer insertHumanity(Humanity humanity);
}
