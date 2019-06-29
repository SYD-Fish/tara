package com.syd.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * ClassName:UserController
 * Package:com.syd.goods.controller
 * Date:2019/6/29 15:18
 * Author: syd-fish
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @PostMapping("/login")
    public boolean login() {

        return false;
    }

    @PostMapping("logout")
    public boolean logout() {
        return true;
    }

}
