package com.mchr.cuiy.service.impl;

import com.mchr.cuiy.dao.CategoryDao;
import com.mchr.cuiy.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;
}
