package com.mchr.cuiy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mchr.cuiy.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryDao extends BaseMapper<Category> {
}
