package com.qianfeng.mybatis.controller;

import com.qianfeng.mybatis.entity.TUser;
import com.qianfeng.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("hello/{id}")
    public TUser hello(@PathVariable Long id){
        TUser  user=userService.getUserById(id);
        return user;
    }
}
