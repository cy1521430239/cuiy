package com.mchr.cuiy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mchr.cuiy.dao.UserDao;
import com.mchr.cuiy.pojo.User;
import com.mchr.cuiy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User queryUser(String username, String password) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("username",username);
        User user = userDao.selectOne(queryWrapper);
        if (user==null){
            return null;
        }

        return user;
    }
}
