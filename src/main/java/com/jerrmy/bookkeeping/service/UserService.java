package com.jerrmy.bookkeeping.service;

import com.jerrmy.bookkeeping.entity.User;

import java.util.List;

/**
 * DateTime : 2019/6/25  17:13
 * Author: Jermmy.
 */
public interface UserService {

    /**
     * 获取所有用户
     *
     * @return
     */
    List<User> getAllUsers();

    /**
     * 根据ID查询用户
     *
     * @return
     */
    List<User> getUserById(String id);

    /**
     * 根据姓名查询用户
     *
     * @return
     */
    List<User> getUserByName(String name);

    /**
     * 根据手机号查询用户
     *
     * @return
     */
    List<User> getUserByPhone(String phone);

    /**
     * 创建用户
     * @param user
     */
    int create(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

}
