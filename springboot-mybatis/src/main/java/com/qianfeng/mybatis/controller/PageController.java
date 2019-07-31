package com.qianfeng.mybatis.controller;


import com.qianfeng.mybatis.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("hello")
    public String hello(Model model){
        String username="马云";
        model.addAttribute("username",username);
        int money=1000;
        model.addAttribute("money",money);
//        List<TUser>  users=new ArrayList<>();
//        TUser u1=new TUser(1l,"dm1","123");
//        TUser u2=new TUser(2l,"dm2","123");
//        TUser u3=new TUser(3l,"dm3","123");
//        users.add(u1);
//        users.add(u2);
//        users.add(u3);
//        model.addAttribute("users",users);
        model.addAttribute("now",new Date());
        return "hello";
    }
}
