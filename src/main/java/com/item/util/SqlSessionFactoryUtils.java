package com.item.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 封装SqlSessionFactory工具类
 */
public class SqlSessionFactoryUtils {

    // 定义SqlSessionFactory
    private static SqlSessionFactory sqlSessionFactory;

    // 静态代码块初始化
    static {

        try {
            // 1.加载主配置文件sqlMapConfig.xml
            InputStream  inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");

            // 2.读取解析配置文件
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            /**
             * sqlSessionFactory：
             *      1.它是框架的核心对象
             *      2.它是线程安全的
             *      3.一个项目中，通常只需要一个即可（单例设计模式的应用）
             */
             sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            System.out.println("初始化SqlSessionFactory对象异常。");
        }

    }

    // 提供一个公有的方法（静态）获取SqlSessionFactory
    public static  SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

}
