package com.mchr.cuiy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mchr.cuiy.pojo.User;

public interface UserService  extends IService<User> {
    User queryUser(String username, String password);
}
