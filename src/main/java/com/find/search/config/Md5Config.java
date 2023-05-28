package com.find.search.config;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

public class Md5Config {
    public static void main(String[] args) {
//        直接生成盐值
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        System.out.println("盐值:"+salt);
        String simpleHash = new SimpleHash("MD5", "123456",salt, 2).toString();
        System.out.println(simpleHash);
    }
}
