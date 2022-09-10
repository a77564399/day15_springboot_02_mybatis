package com.tang.day15_springboot_02_mybatis;

import com.tang.Day15Springboot02MybatisApplication;
import com.tang.Mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Day15Springboot02MybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test()
    {
        System.out.println(userMapper.queryUserList());
    }
}
