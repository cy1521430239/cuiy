package com.mchr.cuiy.controller;

import com.mchr.cuiy.pojo.User;
import com.mchr.cuiy.result.R;
import com.mchr.cuiy.result.ResultCodeEnum;
import com.mchr.cuiy.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
@Api("登录功能")
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpSession session;

    @PostMapping("/login")
    public R login(@RequestBody User user){
        User user1=userService.queryUser(user.getUsername(),user.getPassword());
        if (user1==null){
        return R.setResult(ResultCodeEnum.LOGIN_ERROR);
        }
            session.setAttribute("user",user1);
            return R.setResult(ResultCodeEnum.SUCCESS).message("登录成功").data(user1);
    }

}
