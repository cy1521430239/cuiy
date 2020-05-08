package com.mchr.cuiy.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;

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
    @ApiModelProperty(hidden = true)
    private int id;
    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空")
    private String username;
    /**
     * 用户密码
     */
    @Length(min = 6,max = 50,message = "输入密码不合法")
    private String password;
    /**
     * 用户邮箱
     */
    @Email
    private String email;
    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(value = "is_deleted")
    @ApiModelProperty(hidden = true)
    private Boolean deleted;
    /**
     * 密码加盐
     */
    @ApiModelProperty(hidden = true)
    private String salt;

    /**
     * 角色
     */

    private String name;
    /**
     * 电话号码
     *
     */
    private String phone;
    /**
     * User status
     */
    private boolean enabled;
}
