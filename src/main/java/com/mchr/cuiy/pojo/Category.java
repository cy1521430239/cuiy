package com.mchr.cuiy.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "category")
public class Category {

    private int id;

    private String name;
}
