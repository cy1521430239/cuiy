package com.mchr.cuiy.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
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
    @TableField(value = "is_deleted")
    private boolean deleted;
}
