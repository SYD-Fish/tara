package com.syd.goods.controller;

import com.syd.goods.model.AdminModel;
import com.syd.goods.service.AdminService;
import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Description:
 * ClassName:System
 * Package:com.syd.goods.controller
 * Date:2019/6/29 14:24
 * Author: syd-fish
 */
@RestController
@RequestMapping("/api/system")
public class SystemController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/nauoth/healthcheck")
    public String healthCheck() {
        return "OK";
    }

    @GetMapping("/getAdminId/{website}")
    public Integer getAdmin(@PathVariable("website") String website){
        System.out.println(website);
        return adminService.getAdminId(website);
    }
}
