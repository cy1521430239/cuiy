package com.mchr.cuiy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mchr.cuiy.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
