package com.byx.demo.controller;
import com.byx.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;


@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/Login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(String userName,
                        String password){
        if(userService.getByUserName(userName,password).size()>0){
            return "Book";
        }
        return "login";
    }
    @RequestMapping("/")
    public String findAll() {
        return "login";
    }


}
