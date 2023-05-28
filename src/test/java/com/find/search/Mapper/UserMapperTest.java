package com.find.search.Mapper;

import com.find.search.entity.User;
import com.find.search.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 自定义测试类需要声明注解：@SpringBootTest：表示当前的类是一个测试类，不会随项目一块打包
 */

@SpringBootTest

public class UserMapperTest {
    // idea有检测的功能，接口是不能直接创建Bean
    @Autowired
    private UserMapper userMapper;

    /**
     * 单元测试方法：可以单独独立运行，而不需要启动整个项目，可以做单元测试，提升代码的测试效率
     * 1、必须被@Test注解修饰
     * 2、返回值类型必须是void类型，否则会报错
     * 3、方法的参数泪飙不指定任何类型
     * 4、方法的访问修饰符必须是public
     */
    @Test
    public void insert(){
        User user = new User();
        user.setUserName("tom");
        user.setUserPassword("123");
        user.setPower(0);
        Integer rows = userMapper.insertUser(user);
        System.out.println(rows);
    }

}
