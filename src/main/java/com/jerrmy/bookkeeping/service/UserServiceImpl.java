package com.jerrmy.bookkeeping.service;

import com.jerrmy.bookkeeping.dao.UserDao;
import com.jerrmy.bookkeeping.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DateTime : 2019/6/26  10:52
 * Author: Jermmy.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public List<User> getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public List<User> getUserByPhone(String phone) {
        return userDao.getUserByPhone(phone);
    }

    @Override
    public int create(User user) {
        return userDao.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
