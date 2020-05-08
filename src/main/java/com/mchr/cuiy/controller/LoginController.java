package com.mchr.cuiy.controller;

import com.mchr.cuiy.pojo.User;
import com.mchr.cuiy.result.R;
import com.mchr.cuiy.result.ResultCodeEnum;
import com.mchr.cuiy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("api")
@Api("登录功能")
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private HttpSession session;

    @PostMapping("/login")
    @ApiOperation("登录")
    public R login(@RequestBody @Validated User user){
        User user1=userService.queryUser(user.getUsername(),user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(usernamePasswordToken);
            return R.ok().message("登录成功");
        }catch (AuthenticationException e){
            return R.error().message("账号或者密码错误，请重新输入");
        }
    }

    @GetMapping("logout")
    @ApiOperation("登出")
    public R logout(){
        Subject subject=SecurityUtils.getSubject();
        subject.logout();
        return R.ok().message("登出成功");
    }


}
