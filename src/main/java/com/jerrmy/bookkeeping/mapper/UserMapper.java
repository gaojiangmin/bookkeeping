package com.jerrmy.bookkeeping.mapper;

import com.jerrmy.bookkeeping.entity.User;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * DateTime : 2019/6/26  10:07
 * Author: Jermmy.
 */
@Mapper
public interface UserMapper extends BaseMapper{


    /**
     * 获取所有用户
     * @return
     */
    List<User> getAllUsers();

    /**
     * 根据Id查询用户
     * @param id
     * @return
     */
    List<User> getUserById(String id);


    /**
     * 根据姓名查询用户
     * @param name
     * @return
     */
    List<User> getUserByName(String name);

    /**
     * 根据手机号查询用户
     * @param phone
     * @return
     */
    List<User> getUserByPhone(String phone);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 修改用户
     * @param user
     */
    void updateUser(User user);
}
