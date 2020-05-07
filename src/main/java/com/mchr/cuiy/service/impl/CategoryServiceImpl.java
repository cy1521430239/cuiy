package com.mchr.cuiy.service.impl;


import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mchr.cuiy.dao.CategoryDao;
import com.mchr.cuiy.pojo.Category;
import com.mchr.cuiy.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {


}
