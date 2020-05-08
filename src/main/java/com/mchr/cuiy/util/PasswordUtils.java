package com.mchr.cuiy.util;

import org.apache.shiro.crypto.hash.SimpleHash;

public class PasswordUtils {

    public static String encrypt(String password,String salt){
        int times=2;
        String pwd=new SimpleHash("md5",password,salt,times).toString();
        return pwd;

    }

}
