package com.mchr.cuiy.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "book")
public class Book {
    @TableId
    private int id;

    private String cover;

    private String title;

    private String author;

    private String date;

    private String press;

    private String abs;

    private int cid;

    @TableLogic
    @TableField(value = "id_deleted")
    private int deleted;
}
