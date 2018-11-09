package com.item.po;

import java.util.Date;

/**
 * @author hy
 * 创建实体类用来保存查询出的数据
 * 提供get与set，同时toStirng方法
 *
 *
 */
public class User {
    private Integer id;// int(11) NOT NULL AUTO_INCREMENT,
    private String username;// varchar(32) NOT NULL COMMENT '用户名称',
    private Date birthday;// date DEFAULT NULL COMMENT '生日',
    private String sex;// char(1) DEFAULT NULL COMMENT '性别',
    private String address;// varchar(256) DEFAULT NULL COMMENT '地址',

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
