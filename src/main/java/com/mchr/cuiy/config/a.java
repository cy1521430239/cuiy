package com.mchr.cuiy.config;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.conditions.ISqlSegment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a {

    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        System.out.println(list.size());
        list.add(new Student("1001","张三",18,0));
        list.add(new Student("1002","李四",19,1));
        list.add(new Student("1003","王五",20,1));
        list.add(new Student("1004","王小二",21,0));
        list.add(new Student("1005","李处",22,1));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Student{
    private String idCard;
    private String name;
    private int age;
    private int sex;
}
