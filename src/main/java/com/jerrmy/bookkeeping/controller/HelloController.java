package com.jerrmy.bookkeeping.controller;

import com.jerrmy.bookkeeping.config.LimitConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * DateTime : 2019/5/8  18:39
 * Author: Jermmy.
 */
@RestController
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot:" + limitConfig.getDescription();
    }

    @RequestMapping("/getAllUser")
    public String getAllUser() {
        return "no user";
    }

    @RequestMapping(value = "/getUserPhone", method = RequestMethod.GET, produces = {"application/JSON"})
    public String getUserPhoneById(@RequestParam(required = false, defaultValue = "asdfgh") String personId) {
        System.out.println("ID is " + personId);
        return "Get ID from query string of URL with value element:" + personId;
    }

    @RequestMapping(value = {
            "",
            "/test",
            "test*"
    })
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/fetch/{id}", method = RequestMethod.GET)
    public String getDynamicUriValue(@PathVariable String id) {
        System.out.println("ID is " + id);
        return "Dynamic URI parameter fetched";
    }

}
