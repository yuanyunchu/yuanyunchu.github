package com.item.controller;

import com.item.dao.UserDao;
import com.item.po.User;
import com.item.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author hy

 * 表现层
 */
public class UserController {
    public static void main(String[] args) {
        //加载核心配置文件 （会话工厂） SqlSessionFactoryUtils是我创的一个工具类
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        //获取Session对象，提供对数据库的操作
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //加载接口方法
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //创建User对象添加修改数据,修改id=1，小小花的姓名
        User user = new User();
        user.setId(1);
        user.setUsername("小花");
        //调用方法接口传入user对象
        userDao.alterUser(user);

        //查询所有用户
        List<User> allUser = userDao.findAllUser();
        for (User dao : allUser) {
            System.out.println(dao);
        }
//        进行增删改操作，需要提交事务，不然在数据库中显示不出数据
        sqlSession.commit();
        //关闭资源
        sqlSession.close();

    }

}
