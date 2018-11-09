package com.item.dao;

import com.item.po.User;

import java.util.List;

/**
 * @author hy
 *
 */
public interface UserDao  {

    /**
     * 查询数据库所有用户的信息
     */
    List<User> findAllUser();

    /**
     * 根据id修改用户信息
     */
    void alterUser(User user);
}
