package com.mchr.cuiy.service.impl;

import com.mchr.cuiy.dao.BookDao;
import com.mchr.cuiy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
}
