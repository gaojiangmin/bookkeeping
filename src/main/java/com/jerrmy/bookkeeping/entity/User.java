package com.jerrmy.bookkeeping.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * DateTime : 2019/6/26  9:36
 * Author: Jermmy.
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private String password;
    private Date birthday;
    private String phone;
    private String sex;
    private String age;

    public User() {
        super();
    }

    public User(Long id, String name, String password, Date birthday, String phone, String sex, String age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
