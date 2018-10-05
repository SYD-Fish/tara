package com.syd.tara.controller;

import com.syd.tara.bean.UserDO;
import com.syd.tara.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Test {

    @Autowired
    private UserService userService;
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world";
    }

    @RequestMapping("/merchan")
    @ResponseBody
    String merchandies(){
        List<UserDO> users = null;
        UserDO user = new UserDO();
        user.setId(1);
        users = userService.getUserList(user);
        return users.get(0).getName();
    }
}
