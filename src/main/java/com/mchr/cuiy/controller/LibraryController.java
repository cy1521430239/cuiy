package com.mchr.cuiy.controller;

import com.mchr.cuiy.pojo.Book;
import com.mchr.cuiy.result.R;
import com.mchr.cuiy.service.BookService;
import com.mchr.cuiy.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
        //list.forEach(System.out::println);
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

    @PostMapping("delete")
    public R deletedBook(@RequestBody Book book){
        System.out.println(book.getId());
        boolean removeById = bookService.removeById(book.getId());
        if (removeById){
            return R.ok();
        }
        return R.error();
    }

    @PostMapping("covers")
    public String coversUpload(MultipartFile file) throws Exception {
        String folder = "D:/develop/studycode/workspace/img";
        File imageFolder = new File(folder);
        File f = new File(imageFolder, StringUtils.getRandomString(6) + file.getOriginalFilename()
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            String imgURL = "http://localhost:8443/api/file/" + f.getName();
            return imgURL;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }


    }
}
