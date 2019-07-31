package com.qianfeng.springboothello.controller;


import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class helloController {
    @Autowired
private Resource resource;

    @GetMapping("hello")
        public String hello(){
            return resource.getEmailServer()+":"+resource.getImageServer();
    }

    @GetMapping("page")
    public  String page(@RequestParam(name="pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex="+pageIndex;
    }
    @GetMapping("page/{pageIndex}")
    public  String page2(@PathVariable Integer pageIndex){
        return "pageIndex="+pageIndex;
    }
    @PostMapping("entity")
    public User user(User user){
        return user;
    }

}
