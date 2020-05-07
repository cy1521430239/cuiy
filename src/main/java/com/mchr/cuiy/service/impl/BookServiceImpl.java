package com.mchr.cuiy.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mchr.cuiy.dao.BookDao;

import com.mchr.cuiy.pojo.Book;
import com.mchr.cuiy.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService{




}
