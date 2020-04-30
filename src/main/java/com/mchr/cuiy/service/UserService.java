package com.mchr.cuiy.service;

import com.mchr.cuiy.pojo.User;

public interface UserService  {
    User queryUser(String username, String password);
}
