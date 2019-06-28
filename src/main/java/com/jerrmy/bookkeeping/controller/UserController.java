package com.jerrmy.bookkeeping.controller;

import com.jerrmy.bookkeeping.entity.User;
import com.jerrmy.bookkeeping.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * DateTime : 2019/6/25  17:11
 * Author: Jermmy.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    /**
     * 查询用户
     *
     * @param userId
     * @param name
     * @param phone
     * @return
     */
    @GetMapping("/getUser")
    public List<User> getUserById(@RequestParam(required = false) String userId, @RequestParam(required = false) String name, @RequestParam(required = false) String phone) {
        List<User> users = new ArrayList<>();
        if (!StringUtils.isEmpty(userId)) {
            users = userService.getUserById(userId);
            return users;
        }
        if (!StringUtils.isEmpty(name)) {
            users = userService.getUserByName(name);
            return users;
        }
        if (!StringUtils.isEmpty(phone)) {
            users = userService.getUserByPhone(phone);
            return users;
        }
        return users;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name,
                          @RequestParam String phone,
                          @RequestParam(defaultValue = "123456") String password,
                          @RequestParam(required = false) String sex,
                          @RequestParam(required = false) String age) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setPassword(password);
        user.setSex(sex);
        user.setAge(age);
        int result = userService.create(user);
        if (result == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/updateUser")
    public void updateUser(@RequestParam Long id,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false) String phone,
                           @RequestParam(required = false) String password,
                           @RequestParam(required = false) String sex,
                           @RequestParam(required = false) String age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        user.setPassword(password);
        user.setSex(sex);
        user.setAge(age);
        userService.updateUser(user);
    }



    //测试修改上传

}
