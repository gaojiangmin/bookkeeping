package com.jerrmy.bookkeeping.dao;

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
public interface UserDao {

    @Select("select * from tb_user")
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
    })
    List<User> getAllUsers();

    @Select("select * from tb_user where id=#{id}")
    List<User> getUserById(String id);

    @Select("select * from tb_user where name=#{name}")
    List<User> getUserByName(String name);

    @Select("select * from tb_user where phone=#{phone}")
    List<User> getUserByPhone(String phone);

    @Insert("insert into tb_user(name,password,phone,sex,age) values (#{name},#{password},#{phone},#{sex},#{age})")
    int addUser(User user);

    @Delete("delete from tb_user where id=#{id}")
    void deleteUser(Long id);

    @Update("update tb_user set name=#{name},password=#{password},phone=#{phone},sex=#{sex},age=#{age} where id=#{id}")
    void updateUser(User user);
}
