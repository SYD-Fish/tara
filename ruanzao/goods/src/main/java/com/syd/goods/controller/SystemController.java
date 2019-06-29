package com.syd.goods.controller;

import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/nauoth/healthcheck")
    public String healthCheck() {
        return "OK";
    }
}
