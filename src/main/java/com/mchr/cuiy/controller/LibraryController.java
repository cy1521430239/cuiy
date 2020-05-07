package com.mchr.cuiy.controller;

import com.mchr.cuiy.pojo.Book;
import com.mchr.cuiy.result.R;
import com.mchr.cuiy.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("图书管理")
@RequestMapping("api")
@CrossOrigin
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping("books")
    public R queryBooks(){
        List<Book> list = bookService.list();
        list.forEach(System.out::println);
        if (list==null&&list.size()==0){
            return R.error().message("查询失败");
        }
        return R.ok().data(list);
    }

    @PostMapping("save")
    public R insertBook(@RequestBody Book book){
        Boolean flag=bookService.saveOrUpdate(book);
        if (flag){
        return R.ok();
        }
        return R.error().message("保存或修改失败");
    }

    @DeleteMapping("delete")
    public R deletedBook(List ids){
        boolean removeByIds = bookService.removeByIds(ids);
        if (removeByIds){
            return R.ok();
        }
        return R.error();
    }



}
