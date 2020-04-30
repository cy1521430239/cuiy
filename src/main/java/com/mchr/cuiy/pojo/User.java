package com.mchr.cuiy.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId
    private int id;
    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    private String username;
    /**
     * 用户密码
     */
    @Length(min = 6,max = 20,message = "请输入6-20位的密码")
    private String password;
    /**
     * 用户邮箱
     */
    @Email
    private String email;
}
