package com.mchr.cuiy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mchr.cuiy.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CuiyApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("username","xzcsd");
        System.out.println(userService.getOne(queryWrapper));
    }

}
