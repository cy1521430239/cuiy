package com.mchr.cuiy.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mchr.cuiy.pojo.User;
import com.mchr.cuiy.result.R;
import com.mchr.cuiy.service.UserService;
import com.mchr.cuiy.util.PasswordUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@Api("用户管理")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("user/register")
    @ApiOperation(value = "登录方法")
    public R register(@RequestBody @Validated User user){
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("username",user.getUsername());
        User user1 = userService.getOne(queryWrapper);
        if (user1!=null){
            return R.error().message("用户名已被使用");
        }
        // 生成盐,默认长度 16 位
        String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        //调用方法对密码加密加盐
        String password= PasswordUtils.encrypt(user.getPassword(),salt);
        user.setPassword(password);
        user.setSalt(salt);
        //保存用户到数据库
        boolean save = userService.save(user);
        if (save){
            return R.ok().message("注册成功");
        }else {
            return R.error().message("注册失败，请重新注册");
        }


    }
}
