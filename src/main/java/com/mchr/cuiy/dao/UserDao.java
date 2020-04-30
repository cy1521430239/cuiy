package com.mchr.cuiy.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mchr.cuiy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
